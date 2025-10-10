import java.util.Scanner;

public class ScoreSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	int[] scores = new int[10];      

	for (int i = 0; i < 10; i++) {
	System.out.print("Enter 10 score " + (i + 1) + ": ");

	scores[i] = input.nextInt();
	}
        int sum = 0;
        for (int i = 0; i < 10; i++) {
	sum += scores[i];
        }
        System.out.println("The sum of the 10 scores is: " + sum);
    }
}