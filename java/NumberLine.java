<<<<<<< HEAD
import java.util.Scanner;

public class NumberLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
           }
       }
   }
}

 Prompt the user to enter a number
 Display the number falls on the number line 
 Display for Positive Odd/Even if the number is an odd/even number with no negative sign
 Display for negative odd/even if the number is an odd/even number with a minus in front
=======
import java.util.Scanner;

public class NumberLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
           }
       }
   }
}

 Prompt the user to enter a number
 Display the number falls on the number line 
 Display for Positive Odd/Even if the number is an odd/even number with no negative sign
 Display for negative odd/even if the number is an odd/even number with a minus in front
>>>>>>> 89586d463b124ba6700f9daa9e849b5cef5b2fd9
 Print 