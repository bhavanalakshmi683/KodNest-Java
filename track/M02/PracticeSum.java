
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class PracticeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();
        s1.registrationId = sc.nextInt();
        s1.name = sc.next();
        s1.attendancePercentage = sc.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.registrationId = sc.nextInt();
        s2.name = sc.next();
        s2.attendancePercentage = sc.nextDouble();

        // Read the selected ID and new attendance
        int newRegistrationId = sc.nextInt();
        double newAttendancePercentage = sc.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (newRegistrationId == s1.registrationId) {
            selectedStudent = s1;
        } else if (newRegistrationId == s2.registrationId) {
            selectedStudent = s2;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendancePercentage;

            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(s1.registrationId + " - " + s1.name + " - "
                + s1.attendancePercentage + "%");

        System.out.println(s2.registrationId + " - " + s2.name + " - "
                + s2.attendancePercentage + "%");
    }
}
