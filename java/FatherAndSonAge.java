How old is father
How old is son
If father's age or son's age is less than 1 or more than 80 it is not possible
If son's age is not older than father, father must be older
If father is more than twice son's age Years ago the father was older than son
If father is less than twice son's age Father will be twice as old as son
If father is exactly twice son's age right now


import java.util.Scanner;

	public class FatherAndSonAge {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current father's age (1 - 80): ");
        int fatherAge = input.nextInt();

        System.out.print("Enter the current son's age (1 - 80): ");
        int sonAge = input.nextInt();

        if (fatherAge < 1 || fatherAge > 80 || sonAge < 1 || sonAge > 80) {
            System.out.println("Ages must be between 1 and 80.");
        } else if (fatherAge <= sonAge) {
            System.out.println("Father's age must be greater than son's age.");
        } else {
            int years = Math.abs(fatherAge - 2 * sonAge);

        if (fatherAge > 2 * sonAge) {
        System.out.println(years + " years ago, the father was twice as old as his son.");

        } else if (fatherAge < 2 * sonAge) {
        System.out.println("In " + years + " years, the father will be twice as old as his son.");

        } else {
        System.out.println("Right now, the father is twice as old as his son.");
            }
        }
    }
}


