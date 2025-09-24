Prompt user to eneter first and second integer 
Show numbers
Claculate the Sum of the two integers

import java.util.Scanner;

	public class Addition {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();

	int sum = num1 + num2;
	System.out.println("The sum is: " + sum);
}
}
	