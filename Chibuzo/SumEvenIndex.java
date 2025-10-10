import java.util.Scanner;

public class SumEvenIndex{
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int evenIndexSum = 0;

        for (int i = 0; i < 10; i += 2) {
            evenIndexSum += scores[i];
        }

        System.out.println("The sum of scores at even indexes is: " + evenIndexSum);
    }
}