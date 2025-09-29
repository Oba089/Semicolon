import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int a = 1; a <= num; a++) {
                factorial *= a;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}