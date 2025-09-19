import java.util.Scanner;

public class ExamGrader {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a grade letter (A - F): ");

        String grade = scanner.nextLine();
	if (grade.equals("A")) {
        System.out.print("Pass"); }

	else if (grade.equals("B")) {
	System.out.print("Pass"); }
	
	else if (grade.equals("C")) {
	System.out.print("Pass"); }

	else if (grade.equals("D")) {
	System.out.print("Pass"); }

	else if (grade.equals("F")) {
	System.out.print("Fail"); }

	else { 
	System.out.print("Invalid"); }
    }
}

Prompt user to enter grade with letter
The grade to uppercase
If grade is A or B or C or D Print "Pass"
Else if grade is F Print "Fail"
Else Print "Invalid"
