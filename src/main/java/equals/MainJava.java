package equals;

import equals.domain.JavaEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static equals.util.JavaEmployeeUtil.createEmployee;

public class MainJava {

    public static void main(String[] args) {
        System.out.println();
        List<JavaEmployee> employees = new ArrayList<JavaEmployee>();
        createEmployee(employees, "Kevin", "Malone");
        createEmployee(employees, "Pam", "Beesly");
        createEmployee(employees, "Dwight", "Schrute");
        createEmployee(employees, "Andy", "Bernard");

        System.out.println("Unsorted students:");
        System.out.println(employees.get(0));
        System.out.println(employees.get(1));
        System.out.println(employees.get(2));
        System.out.println(employees.get(3));
        System.out.println();

        Collections.sort(employees);

        System.out.println("Sorted students:");
        System.out.println(employees.get(0));
        System.out.println(employees.get(1));
        System.out.println(employees.get(2));
        System.out.println(employees.get(3));
        System.out.println();

        List<JavaEmployee> jims = new ArrayList<JavaEmployee>();
        JavaEmployee jim = createEmployee(jims, "Jim", "Halpert");
        JavaEmployee jimSameReference = jim;
        JavaEmployee jimSameValues = new JavaEmployee(jim.getId(), jim.getFirstName(), jim.getLastName(), jim.getEmail());
        JavaEmployee jimSameNameDifferentValues = createEmployee(jims, "Jim", "Halpert");

        System.out.println("jim                        // " + jim);
        System.out.println("jimSameReference           // " + jimSameReference);
        System.out.println("jimSameValues              // " + jimSameValues);
        System.out.println("jimSameNameDifferentValues // " + jimSameNameDifferentValues);
        System.out.println();

        System.out.println("jim == jim                        // " + (jim == jim));
        System.out.println("jim == jimSameReference           // " + (jim == jimSameReference));
        System.out.println("jim == jimSameValues              // " + (jim == jimSameValues));
        System.out.println("jim == jimSameNameDifferentValues // " + (jim == jimSameNameDifferentValues));
        System.out.println();

        System.out.println("jim.equals(jim)                        // " + jim.equals(jim));
        System.out.println("jim.equals(jimSameReference)           // " + jim.equals(jimSameReference));
        System.out.println("jim.equals(jimSameValues)              // " + jim.equals(jimSameValues));
        System.out.println("jim.equals(jimSameNameDifferentValues) // " + jim.equals(jimSameNameDifferentValues));
        System.out.println();
    }
}