package goconf



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AppSettingController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AppSetting.list(params), model:[appSettingInstanceCount: AppSetting.count()]
    }

    def show(AppSetting appSettingInstance) {
        respond appSettingInstance
    }

    def create() {
        respond new AppSetting(params)
    }

    @Transactional
    def save(AppSetting appSettingInstance) {
        if (appSettingInstance == null) {
            notFound()
            return
        }

        if (appSettingInstance.hasErrors()) {
            respond appSettingInstance.errors, view:'create'
            return
        }

        appSettingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appSetting.label', default: 'AppSetting'), appSettingInstance.id])
                redirect appSettingInstance
            }
            '*' { respond appSettingInstance, [status: CREATED] }
        }
    }

    def edit(AppSetting appSettingInstance) {
        respond appSettingInstance
    }

    @Transactional
    def update(AppSetting appSettingInstance) {
        if (appSettingInstance == null) {
            notFound()
            return
        }

        if (appSettingInstance.hasErrors()) {
            respond appSettingInstance.errors, view:'edit'
            return
        }

        appSettingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AppSetting.label', default: 'AppSetting'), appSettingInstance.id])
                redirect appSettingInstance
            }
            '*'{ respond appSettingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AppSetting appSettingInstance) {

        if (appSettingInstance == null) {
            notFound()
            return
        }

        appSettingInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AppSetting.label', default: 'AppSetting'), appSettingInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appSetting.label', default: 'AppSetting'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
