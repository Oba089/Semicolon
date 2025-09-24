Pseudocode
Prompt user to enter two integers
Display first and second integer
Calculate the division of both numbers

import java.util.Scanner;

	public class Division {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();

	int div = num1 / num2;

	System.out.println("The Division is: " + div);
}
}