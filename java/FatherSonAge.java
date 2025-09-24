import java.util.Scanner;

	public class FatherAndSonAge {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the current father's age(1 - 80) ");
	int fatherAge = input.nextInt(;

	System.out.print("Enter the current Son's age(1 -80) ");
	int sonAge = input.nextInt(;

	if(father's Age < 1; fatherAge > 80; sonAge < 1; sonAge > 80)(
	System.out.print("Ages must be between 1 and 80");

	)else if(fatherAge <= sonAge) (

	System.out.print("Father's age must be greater than son's age);

	) else (
	int years = Math.abs(fatherAge - 2*sonAge);

	if(fatherAge > 2 * sonAge)(
	System.out.println(years + "years ago, the father was twice as old as his son");

	) else if (fatherAge < 2 * sonAge)(
	System.out.println("In" + years + years father will be twice as old as son");

	) else (
	System.out.print("Right now, the father is twice as old as son");

	}
}
}
} 
	
