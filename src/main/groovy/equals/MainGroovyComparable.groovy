package equals

import equals.domain.GroovyEmployeeComparable

import static equals.util.GroovyEmployeeUtil.createEmployeeSortable

class MainGroovyComparable {

    static void main(String[] args) {
        println()
        List<GroovyEmployeeComparable> unsorted = []
        createEmployeeSortable(unsorted, 'Kevin', 'Malone')
        createEmployeeSortable(unsorted, 'Pam', 'Beesly')
        createEmployeeSortable(unsorted, 'Dwight', 'Schrute')
        createEmployeeSortable(unsorted, 'Andy', 'Bernard')

        println 'Unsorted students:'
        println unsorted[0]
        println unsorted[1]
        println unsorted[2]
        println unsorted[3]
        println()

        List<GroovyEmployeeComparable> sorted = unsorted.sort(false)

        println 'Sorted students:'
        println sorted[0]
        println sorted[1]
        println sorted[2]
        println sorted[3]
        println()

        List<GroovyEmployeeComparable> jims = []
        GroovyEmployeeComparable jim = createEmployeeSortable(jims, 'Jim', 'Halpert')
        GroovyEmployeeComparable jimSameReference = jim
        GroovyEmployeeComparable jimSameValues = new GroovyEmployeeComparable(id: jim.id, firstName: jim.firstName, lastName: jim.lastName, email: jim.email)
        GroovyEmployeeComparable jimSameNameDifferentValues = createEmployeeSortable(jims, 'Jim', 'Halpert')

        println "jim                        // $jim"
        println "jimSameReference           // $jimSameReference"
        println "jimSameValues              // $jimSameValues"
        println "jimSameNameDifferentValues // $jimSameNameDifferentValues"
        println()

        println "jim.is(jim)                        // ${jim.is(jim)}"
        println "jim.is(jimSameReference)           // ${jim.is(jimSameReference)}"
        println "jim.is(jimSameValues)              // ${jim.is(jimSameValues)}"
        println "jim.is(jimSameNameDifferentValues) // ${jim.is(jimSameNameDifferentValues)}"
        println()

        println "jim == jim                        // ${jim == jim}"
        println "jim == jimSameReference           // ${jim == jimSameReference}"
        println "jim == jimSameValues              // ${jim == jimSameValues}"
        println "jim == jimSameNameDifferentValues // ${jim == jimSameNameDifferentValues}"
        println()

        println "jim.equals(jim)                        // ${jim.equals(jim)}"
        println "jim.equals(jimSameReference)           // ${jim.equals(jimSameReference)}"
        println "jim.equals(jimSameValues)              // ${jim.equals(jimSameValues)}"
        println "jim.equals(jimSameNameDifferentValues) // ${jim.equals(jimSameNameDifferentValues)}"
        println()
    }
}
