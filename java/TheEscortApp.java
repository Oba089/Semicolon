import java.util.Scanner;

public class TheEscortApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 3;  

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("How do you feel today? (excited, moody, overwhelmed, exhausted): ");
        String mood = input.nextLine().toLowerCase();

        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Do you want a suggestion for the day? (yes/no): ");
        String wantSuggestion = input.nextLine().toLowerCase();

        System.out.println("\nHello, " + name + "! Welcome to your personal assistant.");

        // Age range response
        if (age < 13) {
            System.out.println("You are a young explorer!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen life is fun, enjoy it!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adulting can be challenging, stay strong!");
        } else {
            System.out.println("Wisdom looks good on you!");
        }

        switch (mood) {
            case "happy":
                System.out.println("Keep smiling!");
                break;
            case "sad":
                System.out.println("Cheer up! Tomorrow is a new day.");
                break;
            case "excited":
                System.out.println("Awesome! Enjoy your energy!");
                break;
            case "tired":
                System.out.println("Rest well and recharge!");
                break;
            default:
                System.out.println("Interesting mood!");
        }

        if (guess == secretNumber) {
            System.out.println("Wow! You guessed it!");
        } else {
            System.out.println("Try again next time!");
        }

        if (wantSuggestion.equals("yes")) {
            System.out.print("Here’s a suggestion for you today: ");
            switch (mood) {
                case "happy":
                    System.out.println("Go out and play a sport you like!");
                    break;
                case "sad":
                    System.out.println("Take a short walk outside and get some fresh air.");
                    break;
                case "excited":
                    System.out.println("Share your excitement by helping someone!");
                    break;
                case "tired":
                    System.out.println("Have a short nap or rest to recharge.");
                    break;
                default:
                    System.out.println("Do something that makes you feel good!");
            }
        } else {
            System.out.println("No worries! Have a great day anyway!");
        }
    }
}
