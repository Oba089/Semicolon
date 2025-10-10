import java.util.Scanner;

	public class AverageSumEven {
		public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);

		int[] scores = new int[10];

		for (int i = 0 ; i < 10 ; i++) {
	
        	System.out.print("Enter score " + (i + 1) + ": ");
		scores[i] = input.nextInt();
	}
	int sumEven = 0;

	for (int i = 0; i < 10; i++) { 
           if (scores[i] % 2 == 0) {
                sumEven += scores[i];
          }
	}

	double average = (double) sumEven / 10;	

        System.out.println("The sum of the even scores is: " + average);
        
    }
}