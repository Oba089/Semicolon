import java.util.Scanner;

    public class TheLargest {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Emter first number: ");
	double num1 = input.nextDouble();

	System.out.print("Enter second number: ");
	double num2 = input.nextDouble();

	System.out.print("Enter third number: ");
	double num3 = input.nextDouble();

	if (num1 >= num2 && num1 >= num3){
           double largest = num1;
}
	if (num2 >= num1 && num2 >= num3)
{
          double largest = num2;
        }
 	else{
            double largest = num3;
        }
        System.out.print("The largest number is: ");
    }
}


Prompt user to enter first Second and Third number
Use if to display the number greater than
Use else to display the number less than
Print
