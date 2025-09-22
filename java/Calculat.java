
import java.util.Scanner;

public class Calculat{
      public static void main (String [] args) {
 	     Scanner input = new Scanner(System.in);

	System.out.print("Enter weight in kg: ");
	double weight = input.nextDouble();

	System.out.print("Enter height in pounds: ");
	double height = input.nextDouble();

	double kg = weight * 0.453;

	double meters = height * 0.0254;

	double bmiCalc = weight/(height * height);

	System.out.print(bmiCalc);
	
  }
}