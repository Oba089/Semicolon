import java.util.Scanner;

	public class PissaApp {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
int page = 0;
        int choice;

        while (true) {
            switch (page) {
                
                case 0 -> {
                    System.out.println("""
                        Pissa app
                        1. Pizza type
                        2. Number of slices
                        3. Price per box
                      """);
                    System.out.print("Choose: ");
                    choice = input.nextInt();
      
	 switch (choice) {
                        case 1  -> page = 1;
                        case 2  -> page = 2;
                        case 3  -> page = 3;
	}

 	case 1 -> {
                    System.out.println("""
                        Pizza type
                        1. Sapa size
                        2. Small money
                        3. Big boys
                        4. Odogwu
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;

                    else System.out.println("Pizza type " + choice + " selected.");
                }
 	 case 2 -> {
                    System.out.println("""
                        Number of slices
                        1. 4
                        2. 6
                        3. 8
                        4. 12
                        """);
                    choice = input.nextInt();
                    if (choice == 0) page = 0;

                    else System.out.println("Number of slices " + choice + " selected.");
                }

	