
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        double passingPercentage = 60.0;
        return passingPercentage;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double percentage = (javaScore + sqlScore) / 2.0;
        return percentage;
    }
}

//Student Utility using Methods
public class HwSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int javaScore = sc.nextInt();
        int sqlScore = sc.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double re = utility.getPassingPercentage();
        double res = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + res);

        if (res < re) {
            System.out.println("Result: NEEDS IMPROVEMENT");
        } else {
            System.out.println("Result: PASS");
        }

        sc.close();
    }
}
