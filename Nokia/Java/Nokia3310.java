import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int page = 0;
        int choice;

        while (true) {
            switch (page) {
                
                case 0 -> {
                    System.out.println("""
                        Main Menu
                        1. Phone book
                        2. Messages
                        3. Chat
                        4. Call register
                        5. Tones
                        6. Settings
                        7. Call divert
                        8. Games
                        9. Calculator
                        10. Reminders
                        11. Clock
                        12. Profiles
                        13. SIM services
                        -1. Exit
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
                        1. Search
                        2. Add name
                        3. Erase
                        4. Edit
                        5. Assign tone
                        6. Send b’card
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Phone book option " + choice + " selected.");
                }

                
                case 2 -> {
                    System.out.println("""
                        Messages
                        1. Write message
                        2. Inbox
                        3. Outbox
                        4. Templates
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Messages option " + choice + " selected.");
                }

               
                case 3 -> {
                    System.out.println("""
                        Chat
                        Chat not implemented.
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                }

             
                case 4 -> {
                    System.out.println("""
                        Call register
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Call register option " + choice + " selected.");
                }

               
                case 5 -> {
                    System.out.println("""
                        Tones
                        1. Ringing tone
                        2. Ringing volume
                        3. Message alert tone
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Tones option " + choice + " selected.");
                }

                
                case 6 -> {
                    System.out.println("""
                        Settings
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        0. Back
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    else System.out.println("Settings option " + choice + " selected.");
                }

                
                case 11 -> {
                    System.out.println("""
                        Clock
                        1. Alarm clock
                        2. Date setting
                        3. Stopwatch
                        0. Back
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