Pseudocode
Prompt user to enter an integer
Display the integer
Calculate the square root of the integer


import java.util.Scanner;

	public class SquareRoot {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	double num = input.nextDouble();

	
	double sqrt = Math.sqrt(num);

	System.out.println("Square rrot is: " + sqrt);
}
}