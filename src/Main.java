import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        // Get all students
        System.out.println("All students:");
        dao.getAllStudents().forEach(System.out::println);
        System.out.println("Press ENTER for first test...");
        scanner.nextLine();

        // Add a student
        dao.addStudent("Alice", "Wonderland", "alice@example.com", Date.valueOf("2023-09-03"));
        System.out.println("After insert:");
        dao.getAllStudents().forEach(System.out::println);
        System.out.println("Press ENTER for next test...");
        scanner.nextLine();

        // Update a student's email
        dao.updateStudentEmail(1, "new.john.doe@example.com");
        System.out.println("After email update:");
        dao.getAllStudents().forEach(System.out::println);
        System.out.println("Press ENTER for next test...");
        scanner.nextLine();

        // Delete a student
        dao.deleteStudent(2);
        System.out.println("After deletion:");
        dao.getAllStudents().forEach(System.out::println);

    }
}
