import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");

        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teen.");

        } else if (age >= 20 && age <= 59) { 
            System.out.println("You are an adult.");

        } else if (age >= 60) {
            System.out.println("You are a senior.");
}
       
    }
}

Prompt user to eneter age 
To display the age groups use if
To give the age ranges within each group use &&
when the user enters a number not in a Age group use else if
Print

