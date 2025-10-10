import java.util.Scanner;

public class ScoreSumAndAverage {

   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] scores = new int[10];
        
        for (int i = 0; i < 10; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");

            scores[i] = input.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }

	for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }
        System.out.println("The sum of the 10 scores is: " + sum);

        double average = (double) sum / 10;
        
        System.out.println("The average of the 10 scores is: " + average);
      
    }
}