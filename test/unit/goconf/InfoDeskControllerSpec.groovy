package goconf



import grails.test.mixin.*
import spock.lang.*

@TestFor(InfoDeskController)
@Mock(InfoDesk)
class InfoDeskControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.infoDeskInstanceList
            model.infoDeskInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.infoDeskInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def infoDesk = new InfoDesk()
            infoDesk.validate()
            controller.save(infoDesk)

        then:"The create view is rendered again with the correct model"
            model.infoDeskInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            infoDesk = new InfoDesk(params)

            controller.save(infoDesk)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/infoDesk/show/1'
            controller.flash.message != null
            InfoDesk.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def infoDesk = new InfoDesk(params)
            controller.show(infoDesk)

        then:"A model is populated containing the domain instance"
            model.infoDeskInstance == infoDesk
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def infoDesk = new InfoDesk(params)
            controller.edit(infoDesk)

        then:"A model is populated containing the domain instance"
            model.infoDeskInstance == infoDesk
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/infoDesk/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def infoDesk = new InfoDesk()
            infoDesk.validate()
            controller.update(infoDesk)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.infoDeskInstance == infoDesk

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            infoDesk = new InfoDesk(params).save(flush: true)
            controller.update(infoDesk)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/infoDesk/show/$infoDesk.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/infoDesk/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def infoDesk = new InfoDesk(params).save(flush: true)

        then:"It exists"
            InfoDesk.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(infoDesk)

        then:"The instance is deleted"
            InfoDesk.count() == 0
            response.redirectedUrl == '/infoDesk/index'
            flash.message != null
    }
}
