package goconf

import grails.converters.JSON

class ActionController {

    def appConfigService

    def index() {}
    def meet() {
        def card1 = Card.findById(params.card1)
        def card2 = Card.findById(params.card2)

        if(!card1){
            render "unknown Card1='${params.card1}'"
            return
        }
        if(!card2){
            render "unknown Card2='${params.card2}'"
            return
        }

        sendMail {
            async true
            from appConfigService.getSetting('email_from')
            to "${card1.user.email}"
            bcc appConfigService.getSetting('email_bcc')
            subject "Nice to meet you!"
            html "Привет, вы познакомились с ${card2.user.firstName} ${card2.user.lastName}. Имейл: ${card2.user.email}. Информация: ${card2.user.about}"
        }

        sendMail {
            async true
            from appConfigService.getSetting('email_from')
            to "${card2.user.email}"
            bcc appConfigService.getSetting('email_bcc')
            subject "Nice to meet you!"
            html "Привет, вы познакомились с ${card1.user.firstName} ${card1.user.lastName}. Имейл: ${card1.user.email}. Информация: ${card1.user.about}"
        }

        render "ok"
    }

    def info() {
        def card = Card.findById(params.card)
        def infoDesk = InfoDesk.findById(params.desk)

        if(!card){
            render "unknown Card='${params.card}'"
            return
        }
        if(!infoDesk){
            render "unknown InfoDesk='${params.card}'"
            return
        }

        sendMail {
            async true
            from appConfigService.getSetting('email_from')
            to "${card.user.email}"
            bcc appConfigService.getSetting('email_bcc')
            subject "${infoDesk.title}"
            html "${infoDesk.title}<br/><hr><br/><br/>${infoDesk.info}<br/><hr>"
        }

        render "ok"
    }
}
