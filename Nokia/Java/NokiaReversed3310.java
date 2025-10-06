import java.util.Scanner;

public class NokiaReversed3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int page = 0;
        int choice;

        while (true) {
            switch (page) {
               
                case 0 -> {
                    System.out.println("""
                        Main Menu
                        -1. Exit
                        13. SIM services
                        12. Profiles
                        11. Clock
                        10. Reminders
                        9. Calculator
                        8. Games
                        7. Call divert
                        6. Settings
                        5. Tones
                        4. Call register
                        3. Chat
                        2. Messages
                        1. Phone book
                        """);
                    System.out.print("Choose: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1  -> page = 1;
                        case 2  -> page = 2;
                        case 3  -> page = 3;
                        case 4  -> page = 4;
                        case 5  -> page = 5;
                        case 6  -> page = 6;
                        case 7  -> System.out.println("Opening Call divert...");
                        case 8  -> System.out.println("Opening Games...");
                        case 9  -> System.out.println("Opening Calculator...");
                        case 10 -> System.out.println("Opening Reminders...");
                        case 11 -> page = 11;
                        case 12 -> System.out.println("Opening Profiles...");
                        case 13 -> System.out.println("Opening SIM services...");
                        case -1 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                }
                case 1 -> {
                    System.out.println("""
                        Phone book
                        0. Back
                        6. Send b’card
                        5. Assign tone
                        4. Edit
                        3. Erase
                        2. Add name
                        1. Search
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Phone book option " + choice + " selected.");
                }
                case 2 -> {
                    System.out.println("""
                        Messages
                        0. Back
                        4. Templates
                        3. Outbox
                        2. Inbox
                        1. Write message
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Messages option " + choice + " selected.");
                }
                case 3 -> {
                    System.out.println("""
                        Chat
                        0. Back
                        Chat not implemented.
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                }
                case 4 -> {
                    System.out.println("""
                        Call register
                        0. Back
                        3. Dialled numbers
                        2. Received calls
                        1. Missed calls
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Call register option " + choice + " selected.");
                }
                case 5 -> {
                    System.out.println("""
                        Tones
                        0. Back
                        3. Message alert tone
                        2. Ringing volume
                        1. Ringing tone
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Tones option " + choice + " selected.");
                }
                case 6 -> {
                    System.out.println("""
                        Settings
                        0. Back
                        4. Restore factory settings
                        3. Security settings
                        2. Phone settings
                        1. Call settings
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Settings option " + choice + " selected.");
                }
                case 11 -> {
                    System.out.println("""
                        Clock
                        0. Back
                        3. Stopwatch
                        2. Date setting
                        1. Alarm clock
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Clock option " + choice + " selected.");
                }
                default -> page = 0;
            }
        }
    }
}