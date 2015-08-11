package goconf

class Card {

    def long id
    def String code
    static belongsTo = [user: User]

    String toString() {
        return id + ":" + code
    }

    static constraints = {
        code blank: false, nullable: false, size: 1..63
        user blank: false, nullable: true
    }
}
