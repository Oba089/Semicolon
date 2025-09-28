import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int page = 0;  
        int choice;

        while (true) {
            switch (page) {
               
                case 0:
                    System.out.println("\n--- Main Menu ---");
                    System.out.println("1. Phone book");
                    System.out.println("2. Messages");
                    System.out.println("3. Chat");
                    System.out.println("4. Call register");
                    System.out.println("5. Tones");
                    System.out.println("6. Settings");
                    System.out.println("7. Call divert");
                    System.out.println("8. Games");
                    System.out.println("9. Calculator");
                    System.out.println("10. Reminders");
                    System.out.println("11. Clock");
                    System.out.println("12. Profiles");
                    System.out.println("13. SIM services");
                    System.out.println("-1. Exit");
                    System.out.print("Choose: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1: page = 1; 
		break;
                        case 2: page = 2; 
		break; 
                        case 3: page = 3; 
		break; 
                        case 4: page = 4; 
		break; 
                        case 5: page = 5; 
		break; 
                        case 6: page = 6; 
		break; 
                        case 7: System.out.println("Opening Call divert..."); 
		break;
                        case 8: System.out.println("Opening Games..."); 
		break;
                        case 9: System.out.println("Opening Calculator..."); 
		break;
                        case 10: System.out.println("Opening Reminders..."); 
		break;
                        case 11: page = 11; 
		break;
                        case 12: System.out.println("Opening Profiles..."); 
		break;
                        case 13: System.out.println("Opening SIM services..."); 
		break;
                        case -1: System.out.println("Exiting..."); 
		return;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

               
                case 1:
                    System.out.println("\n--- Phone book ---");
                    System.out.println("1. Search");
                    System.out.println("2. Add name");
                    System.out.println("3. Erase");
                    System.out.println("4. Edit");
                    System.out.println("5. Assign tone");
                    System.out.println("6. Send b’card");
                    System.out.println("0. Back");

                    choice = input.nextInt();

                    if (choice == 0) page = 0;

                    else System.out.println("Phone book option " + choice + " selected.");

                break;

                
                case 2:
                    System.out.println("\n--- Messages ---");
                    System.out.println("1. Write message");
                    System.out.println("2. Inbox");
                    System.out.println("3. Outbox");
                    System.out.println("4. Templates");
                    System.out.println("0. Back");
                    choice = input.nextInt();

                    if (choice == 0) page = 0;

                    else System.out.println("Messages option " + choice + " selected.");

                    break;
            
                case 3:
                    System.out.println("\n--- Chat ---");
                    System.out.println("Chat not implemented.");
                    System.out.println("0. Back");
                    choice = input.nextInt();
                    if (choice == 0) page = 0;
                    break;
               
                case 4:
                    System.out.println("\n--- Call register ---");
                    System.out.println("1. Missed calls");
                    System.out.println("2. Received calls");
                    System.out.println("3. Dialled numbers");
                    System.out.println("0. Back");
                    choice = input.nextInt();

                    if (choice == 0) page = 0;

                    else System.out.println("Call register option " + choice + " selected.");

                    break;
               
                case 5:
                    System.out.println("\n--- Tones ---");
                    System.out.println("1. Ringing tone");
                    System.out.println("2. Ringing volume");
                    System.out.println("3. Message alert tone");
                    System.out.println("0. Back");
                    choice = input.nextInt();
                    if (choice == 0) page = 0;

                    else System.out.println("Tones option " + choice + " selected.");

                    break;
             
                case 6:
                    System.out.println("\n--- Settings ---");
                    System.out.println("1. Call settings");
                    System.out.println("2. Phone settings");
                    System.out.println("3. Security settings");
                    System.out.println("4. Restore factory settings");
                    System.out.println("0. Back");
                    choice = input.nextInt();

                    if (choice == 0) page = 0;

                    else System.out.println("Settings option " + choice + " selected.");

                    break;
               
                case 11:
                    System.out.println("\n--- Clock ---");
                    System.out.println("1. Alarm clock");
                    System.out.println("2. Date setting");
                    System.out.println("3. Stopwatch");
                    System.out.println("0. Back");
                    choice = input.nextInt();
                    if (choice == 0) page = 0;

                    else System.out.println("Clock option " + choice + " selected.");

                    break;

                default:
                    page = 0;
            }
        }
    }
}