package goconf

import org.apache.commons.lang.StringUtils

class AppSetting {

    def long id
    def String key
    def String value

    String toString() {
        return key
    }

    static constraints = {
        key blank: false, nullable: false, size: 1..63
        value blank: false, nullable: false, size: 1..254
    }
}
