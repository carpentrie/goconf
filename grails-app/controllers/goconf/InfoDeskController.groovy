package goconf



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InfoDeskController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InfoDesk.list(params), model:[infoDeskInstanceCount: InfoDesk.count()]
    }

    def show(InfoDesk infoDeskInstance) {
        respond infoDeskInstance
    }

    def create() {
        respond new InfoDesk(params)
    }

    @Transactional
    def save(InfoDesk infoDeskInstance) {
        if (infoDeskInstance == null) {
            notFound()
            return
        }

        if (infoDeskInstance.hasErrors()) {
            respond infoDeskInstance.errors, view:'create'
            return
        }

        infoDeskInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'infoDesk.label', default: 'InfoDesk'), infoDeskInstance.id])
                redirect infoDeskInstance
            }
            '*' { respond infoDeskInstance, [status: CREATED] }
        }
    }

    def edit(InfoDesk infoDeskInstance) {
        respond infoDeskInstance
    }

    @Transactional
    def update(InfoDesk infoDeskInstance) {
        if (infoDeskInstance == null) {
            notFound()
            return
        }

        if (infoDeskInstance.hasErrors()) {
            respond infoDeskInstance.errors, view:'edit'
            return
        }

        infoDeskInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InfoDesk.label', default: 'InfoDesk'), infoDeskInstance.id])
                redirect infoDeskInstance
            }
            '*'{ respond infoDeskInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InfoDesk infoDeskInstance) {

        if (infoDeskInstance == null) {
            notFound()
            return
        }

        infoDeskInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InfoDesk.label', default: 'InfoDesk'), infoDeskInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'infoDesk.label', default: 'InfoDesk'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
