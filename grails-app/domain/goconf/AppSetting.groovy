package goconf

class AppSetting {

    def String key
    def String value

    static mapping = {
        id generator: 'assigned', name: 'key'
    }

    static constraints = {
        key blank: false, nullable: false, size: 1..63
        value blank: false, nullable: false, size: 1..254
    }
}
