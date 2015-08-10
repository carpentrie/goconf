package goconf

class Card {

    def long id
    def String code
    def String cardType
    static belongsTo = [user: User]

    static constraints = {
        code blank: false, nullable: true, size: 1..63
        cardType blank: false, nullable: true, size: 1..63
        user blank: false, nullable: true
    }
}
