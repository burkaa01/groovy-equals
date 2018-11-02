package equals.domain;

import java.util.Objects;

public class JavaEmployee implements Comparable {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public JavaEmployee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString() {
        return lastName + ", " + firstName + ", id: " + id + ", email: " + email;
    }

    @Override
    public int compareTo(Object o) {
        JavaEmployee e = (JavaEmployee) o;
        int byLast = this.lastName.compareTo(e.lastName);
        if (byLast != 0) {
            return byLast;
        }
        return this.firstName.compareTo(e.firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof JavaEmployee)) {
            return false;
        }
        JavaEmployee e = (JavaEmployee) o;
        return e.getId() == this.getId()
                && Objects.equals(e.getFirstName(), firstName)
                && Objects.equals(e.getLastName(), lastName)
                && Objects.equals(e.getEmail(), email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
