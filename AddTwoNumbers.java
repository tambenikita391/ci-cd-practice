import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Program to print addition of two numbers");

        Scanner r = new Scanner(System.in);

        int a, b, sum;

        System.out.println("Enter 1st number");
        a = r.nextInt();

        System.out.println("Enter 2nd number");
        b = r.nextInt();

        sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

    }
}