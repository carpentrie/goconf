package goconf

class InfoDesk {

    def long id
    def String info

    static constraints = {
        info blank: false, nullable: true, widget: 'textarea', size: 1..2048
    }
}
