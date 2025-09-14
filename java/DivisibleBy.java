import java.util.Scanner;

   public class DivisibleBy {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both");
        } else if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible");
        }
    }
}

Prompt user to enter a number
If number is divisible by 3 and 5 display "Divisible by both"
Else if number is divisible by 3 display "Divisible by 3"
Else if number is divisible by 5 display "Divisible by 5"
Else display "Not divisible"