Pseudocode
Prompt user to enter a integer
Display the number
Calculate the Squares of the number

import java.util.Scanner;

	public class Squares {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = input.nextInt();

	
	int squares = num * num;

	System.out.println("The Squares is: " + squares);
}
}