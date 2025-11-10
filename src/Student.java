import java.sql.Date;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Date enrollmentDate;

    public Student(int studentId, String firstName, String lastName, String email, Date enrollmentDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }
}
