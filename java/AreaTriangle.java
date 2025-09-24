import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter the coordinates of the third point (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double Area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);

        System.out.println("The area of the triangle is: " + Area);
    
   }
}