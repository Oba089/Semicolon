import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        int[] scores = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter person " + (i + 1) + "'s name: ");
            names[i] = input.nextLine();
            System.out.print("Enter person " + (i + 1) + "'s score: ");
            scores[i] = input.nextInt();
            input.nextLine();
	        }

        int highIndex = 0;
        int lowIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (scores[i] > scores[highIndex]) {
                highIndex = i;
            }
            if (scores[i] < scores[lowIndex]) {
                lowIndex = i;
            }
        }
        
        System.out.printf("Highest Score: %d by %s%n", scores[highIndex], names[highIndex]);
        System.out.printf("Lowest Score: %d by %s%n", scores[lowIndex], names[lowIndex]);
        
}
}