import java.util.Scanner;

public class ScoreAverage {

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
        
        double average = (double) sum / 10;
        
        System.out.println("The average of the 10 scores is: " + average);
      
    }
}