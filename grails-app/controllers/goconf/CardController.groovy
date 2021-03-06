package goconf



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CardController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Card.list(params), model:[cardInstanceCount: Card.count()]
    }

    def show(Card cardInstance) {
        respond cardInstance
    }

    def create() {
        respond new Card(params)
    }

    @Transactional
    def save(Card cardInstance) {
        if (cardInstance == null) {
            notFound()
            return
        }

        if (cardInstance.hasErrors()) {
            respond cardInstance.errors, view:'create'
            return
        }

        cardInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'card.label', default: 'Card'), cardInstance.id])
                redirect cardInstance
            }
            '*' { respond cardInstance, [status: CREATED] }
        }
    }

    def edit(Card cardInstance) {
        respond cardInstance
    }

    @Transactional
    def update(Card cardInstance) {
        if (cardInstance == null) {
            notFound()
            return
        }

        if (cardInstance.hasErrors()) {
            respond cardInstance.errors, view:'edit'
            return
        }

        cardInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Card.label', default: 'Card'), cardInstance.id])
                redirect cardInstance
            }
            '*'{ respond cardInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Card cardInstance) {

        if (cardInstance == null) {
            notFound()
            return
        }

        cardInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Card.label', default: 'Card'), cardInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'card.label', default: 'Card'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
