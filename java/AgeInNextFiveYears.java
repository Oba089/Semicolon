
Pseudocode
Prompt user to enter age 
Display current age 
Add current age with five years
Display how old in the next five years


import java.util.Scanner;
	
	public class AgeInNextFiveYears {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter age:   ");
	
	int age = input.nextInt();

	int ageinfiveyears = age + 5;

	System.out.println("Current age: " + age);

	System.out.println("Age in next five years: " + ageinfiveyears);
	}
}