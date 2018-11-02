package equals

import equals.domain.GroovyEmployeeComparator
import equals.domain.GroovyEmployee

import static equals.util.GroovyEmployeeUtil.createEmployee

class MainGroovyComparator {

    static void main(String[] args) {
        println()
        List<GroovyEmployee> unsorted = []
        createEmployee(unsorted, 'Kevin', 'Malone')
        createEmployee(unsorted, 'Pam', 'Beesly')
        createEmployee(unsorted, 'Dwight', 'Schrute')
        createEmployee(unsorted, 'Andy', 'Bernard')

        println 'Unsorted students:'
        println unsorted[0]
        println unsorted[1]
        println unsorted[2]
        println unsorted[3]
        println()

        List<GroovyEmployee> sorted = unsorted.sort(false, new GroovyEmployeeComparator())

        println 'Sorted students:'
        println sorted[0]
        println sorted[1]
        println sorted[2]
        println sorted[3]
        println()

        List<GroovyEmployee> jims = []
        GroovyEmployee jim = createEmployee(jims, 'Jim', 'Halpert')
        GroovyEmployee jimSameReference = jim
        GroovyEmployee jimSameValues = new GroovyEmployee(id: jim.id, firstName: jim.firstName, lastName: jim.lastName, email: jim.email)
        GroovyEmployee jimSameNameDifferentValues = createEmployee(jims, 'Jim', 'Halpert')

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
