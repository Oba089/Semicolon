Pseudocode
Prompt user to enter first and second integer
Show integers
Calculate the differences


import java.util.Scanner;

	public class Subtraction {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();

	int sub = num1 - num2;

	System.out.println("The subtraction is: " + sub);
}
}