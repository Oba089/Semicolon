import java.util.Scanner;

	public class ValidScores {
	public static void main(String[] args) {
      
	Scanner input = new Scanner(System.in);
      
        int[] scores = new int[10];
        int sum = 0;

               for (int i = 0 ; i < 10 ; i++ ) {
			int score;
			boolean isValid = false;
	       
                System.out.print("Enter score " + (i + 1) + ": ");
                int score = input.nextInt();

                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    isValid = true;
                } else {
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }
            }
        }


        for(int score : scores) {
            sum += score;
        }
        
        System.out.println("The sum of the 10 valid scores is: " + sum);
  
    }
     
