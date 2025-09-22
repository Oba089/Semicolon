import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[3];
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            input.nextLine();
        }

        int youngest = 0;
        int oldest = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
            if (ages[i] > ages[oldest]) {
                oldest = i;
            }
        }

        System.out.println("The youngest person is: " + names[youngest] + " (" + ages[youngest] + " years old)");
        System.out.println("The oldest person is: " + names[oldest] + " (" + ages[oldest] + " years old)");

    }
}