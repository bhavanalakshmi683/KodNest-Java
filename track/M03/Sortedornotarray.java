
import java.util.Scanner;

public class Sortedornotarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] < arr[i]) {
                count = 0;
                break;
            }
        }

        System.out.println(count);
    }
}
