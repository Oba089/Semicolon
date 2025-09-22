import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 7 != 0) {
            System.out.println(number + " is NOT a multiple of 7.");
        }

        if (number % 6 != 0 && number % 7 != 0) {
            System.out.println(number + " is NOT a multiple of 6 and NOT a multiple of 7.");
        }
    }
}