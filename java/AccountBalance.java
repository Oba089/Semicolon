import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter your bank balance: ");
        double balance = input.nextDouble();

        if (balance < 100) {
            System.out.println("Low");
        } else if (balance <= 1000) {
            System.out.println("Medium");
        } else {
            System.out.println("High");
        }
    }
}

Prompt user to enter bank account balance
show balance level
If it's below 1000 print Medium
else if it is above print High
