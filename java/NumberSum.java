import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Total of even numbers: " + evenSum);
        System.out.println("Total of odd numbers: " + oddSum);
  }
}