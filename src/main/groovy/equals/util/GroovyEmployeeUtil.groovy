package equals.util

import equals.domain.GroovyEmployee
import equals.domain.GroovyEmployeeComparable
import equals.domain.JavaEmployee

class GroovyEmployeeUtil {

    private static final Random RANDOM = new Random()

    static GroovyEmployee createEmployee(List employees, String first, String last) {
        GroovyEmployee employee = new GroovyEmployee(
                id: employeeId(employees),
                firstName: first,
                lastName: last,
                email: employeeEmail(employees, first, last)
        )
        employees << employee
        return employee
    }

    static GroovyEmployeeComparable createEmployeeSortable(List employees, String first, String last) {
        GroovyEmployeeComparable employee = new GroovyEmployeeComparable(
                id: employeeId(employees),
                firstName: first,
                lastName: last,
                email: employeeEmail(employees, first, last)
        )
        employees << employee
        return employee
    }

    private static String employeeEmail(List employees, String first, String last, Integer number = null) {
        number = number ?: 1
        String email = "${first.toLowerCase()[0]}${last.toLowerCase()[0..3]}$number@office.com"
        if (!employees) {
            return email
        }
        def emailAlreadyExists = employees.find { it.email == email }
        if (emailAlreadyExists) {
            return employeeEmail(employees, first, last, number + 1)
        }
        return email
    }

    private static int employeeId(List employees, Integer id = null) {
        id = id ?: threeDigitId()
        if (!employees) {
            return id
        }
        def idAlreadyExists = employees.find { it.id == id }
        if (idAlreadyExists) {
            return employeeId(employees, id + 1)
        }
        return id
    }

    private static int threeDigitId() {
        return RANDOM.nextInt(900) + 100
    }
}
