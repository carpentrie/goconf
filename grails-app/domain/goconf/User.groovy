package goconf

class User {

    def long id
    def String firstName
    def String lastName
    def String nickName
    def Date birthDate
    def String organization
    def String position
    def String email
    def String skype
    def String phone
    def String about
    def String vk
    def String fb
    def String ok
    def String linkedIn
    static belongsTo = [card: Card]

    static constraints = {
        firstName blank: false, nullable: true, size: 1..63
        lastName blank: false, nullable: true, size: 1..63
        nickName blank: false, nullable: true, size: 1..63
        birthDate blank: false, nullable: true, format: 'dd-MM-yyyy'
        organization blank: false, nullable: true, size: 1..63
        position blank: false, nullable: true, size: 1..63
        email blank: false, nullable: false, email: true
        skype blank: false, nullable: true, size: 1..63
        phone blank: false, nullable: true, size: 1..63
        about blank: false, nullable: true, size: 1..1024, widget: 'textarea'
        vk blank: false, nullable: true, size: 1..63
        fb blank: false, nullable: true, size: 1..63
        ok blank: false, nullable: true, size: 1..63
        linkedIn blank: false, nullable: true, size: 1..63
        card blank: false, nullable: true
    }
}
