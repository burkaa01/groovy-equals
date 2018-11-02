package equals.domain

class GroovyEmployeeComparator implements Comparator<GroovyEmployee> {

    @Override
    int compare(GroovyEmployee e1, GroovyEmployee e2) {
        int byLast = e1.lastName <=> e2.lastName
        return byLast ?: e1.firstName <=> e2.firstName
    }
}
