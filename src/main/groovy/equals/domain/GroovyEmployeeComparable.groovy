package equals.domain

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class GroovyEmployeeComparable implements Comparable {

    int id
    String firstName
    String lastName
    String email

    String toString() {
        return "$lastName, $firstName, id: $id, email: $email"
    }

    @Override
    int compareTo(Object o) {
        GroovyEmployeeComparable e = (GroovyEmployeeComparable) o
        int byLast = this.lastName <=> e.lastName
        return byLast ?: this.firstName <=> e.firstName
    }
}
