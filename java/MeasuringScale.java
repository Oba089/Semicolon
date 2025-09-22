import java.util.Scanner;

public class MeasuringScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.printf("%.2f feet is %.3f meters.%n", feet, meters);
   }
}