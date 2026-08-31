import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter Array Elements:");

        // Taking input
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        // Displaying array elements
        System.out.println("Array Elements are:");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // Calculating sum
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }

        System.out.println("Total: " + sum);
    }
}