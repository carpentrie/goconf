class BootStrap {

    def appConfigService
    def init = { servletContext ->
        appConfigService.init()
    }
    def destroy = {
    }
}
