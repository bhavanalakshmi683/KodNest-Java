
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        int res = 7;

        return res;
    }

    int add(int first, int second) {
        int sum = first + second; // Return the sum

        return sum;
    }
}

public class FourMethodsHW {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int one = sc.nextInt();
        int two = sc.nextInt();

        MethodDemo s1 = new MethodDemo();

        s1.sayHello();
        s1.greet(name);

        int res = s1.getLuckyNumber();

        System.out.println("Lucky Number: " + res);
        System.out.println("Sum: " + s1.add(one, two));
    }
}
