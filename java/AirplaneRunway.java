import java.util.Scanner;

public class AirplaneRunway {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter takeoff speed v (m/s): ");
        double v = input.nextDouble();

        System.out.print("Enter acceleration a (m/s^2): ");
        double a = input.nextDouble();

        double length = (v * v) / (2 * a);

        System.out.printf("The minimum runway length needed is %.3f meters.%n", length);

    }
}