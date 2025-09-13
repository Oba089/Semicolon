import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
             int number = input.nextInt();
            
      	if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }
            }  else  {
            System.out.println("Invalid input");
    }

Collect input from the user.
Check if it is an integer:
If it is an integer:
If divisible by 2  print “Even”.
Else print “Odd”.
If it is not an integer print "Invalid input
