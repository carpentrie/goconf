package goconf

import grails.transaction.Transactional

@Transactional
class AppConfigService {
    def static defaultSettings = [
            'email_from': 'noreply@inq.su',
            'email_bcc': 'anton.kolabyshev@gmail.com',

    ]

    void init() {
        def settings = AppSetting.list().collectEntries{s -> [s.key, s.value]}
        defaultSettings.each {e ->
            if(!settings.containsKey(e.key)){
                (new AppSetting(key: e.key, value: e.value)).save()
            }
        }
    }

    def String getSetting(String key) {
        return AppSetting.findByKey(key).value
    }
}
