<<<<<<< HEAD
import java.util.Scanner;

public class DegreeInTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        if (temperature < 0) {
            System.out.println("Freezing");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Cold");
        } else if (temperature >= 16 && temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
       }
    }
}

Pseudocode
Prompt user to enter temperature in Celsius
Use if statements to classify the temperature
Diplay degree of temperature
=======
import java.util.Scanner;

public class DegreeInTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        if (temperature < 0) {
            System.out.println("Freezing");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Cold");
        } else if (temperature >= 16 && temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
       }
    }
}

Pseudocode
Prompt user to enter temperature in Celsius
Use if statements to classify the temperature
Diplay degree of temperature
>>>>>>> 89586d463b124ba6700f9daa9e849b5cef5b2fd9
Print