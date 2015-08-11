package goconf

class InfoDesk {

    def long id
    def String title
    def String info

    String toString() {
        return id + "_" + title
    }

    static constraints = {
        title blank: false, nullable: false, size: 1..254
        info blank: false, nullable: false, widget: 'textarea', size: 1..63000
    }
}
