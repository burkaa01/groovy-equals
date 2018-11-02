package equals.util;

import equals.domain.JavaEmployee;

import java.util.List;
import java.util.Random;

public class JavaEmployeeUtil {

    private static final Random RANDOM = new Random();

    public static JavaEmployee createEmployee(List<JavaEmployee> employees, String first, String last) {
        JavaEmployee employee = new JavaEmployee(
                employeeId(employees, null),
                first,
                last,
                employeeEmail(employees, first, last, null)
        );
        employees.add(employee);
        return employee;
    }

    private static String employeeEmail(List<JavaEmployee> employees, String first, String last, Integer number) {
        number = (number != null) ? number : 1;
        String email = first.toLowerCase().charAt(0) + last.toLowerCase().substring(0, 3) + number + "@office.com";
        if (employees == null || employees.isEmpty()) {
            return email;
        }
        boolean emailAlreadyExists = false;
        for (JavaEmployee employee : employees) {
            if (employee.getEmail().equals(email)) {
                emailAlreadyExists = true;
            }
        }
        if (emailAlreadyExists) {
            return employeeEmail(employees, first, last, number + 1);
        }
        return email;
    }

    private static int employeeId(List<JavaEmployee> employees, Integer id) {
        id = (id != null) ? id : threeDigitId();
        if (employees == null || employees.isEmpty()) {
            return id;
        }
        boolean idAlreadyExists = false;
        for (JavaEmployee employee : employees) {
            if (employee.getId() == id) {
                idAlreadyExists = true;
            }
        }
        if (idAlreadyExists) {
            return employeeId(employees, id + 1);
        }
        return id;
    }

    private static int threeDigitId() {
        return RANDOM.nextInt(900) + 100;
    }
}
