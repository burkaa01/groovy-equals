package equals.domain

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class GroovyEmployee {

    int id
    String firstName
    String lastName
    String email

    String toString() {
        return "$lastName, $firstName, id: $id, email: $email"
    }
}
