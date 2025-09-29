import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } 
	else {
        for (int a = 2; a <= num / 2; a++) {

        if (num % a == 0) {

        isPrime = false;

        break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } 
	else {
            System.out.println(num + " is not a prime number.");
        }
    }
}