<<<<<<< HEAD
import java.util.Scanner;

public class HourlyPay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();

        double pay;
  
        if (hours <= 40) {
            pay = hours * rate;
        } else {
            
            double regularPay = 40 * rate;
    
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * rate * 1.5;
     
            pay = regularPay + overtimePay;
        }

        System.out.println("Total pay: $" + pay);
    }
}

Prompt user for hours and rate
If worked how many hours or less
Prompt user for pay for hours
Enter Extra pay for extra hours
Do the Addition of both
=======
import java.util.Scanner;

public class HourlyPay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();

        double pay;
  
        if (hours <= 40) {
            pay = hours * rate;
        } else {
            
            double regularPay = 40 * rate;
    
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * rate * 1.5;
     
            pay = regularPay + overtimePay;
        }

        System.out.println("Total pay: $" + pay);
    }
}

Prompt user for hours and rate
If worked how many hours or less
Prompt user for pay for hours
Enter Extra pay for extra hours
Do the Addition of both
>>>>>>> 89586d463b124ba6700f9daa9e849b5cef5b2fd9
Print total pay