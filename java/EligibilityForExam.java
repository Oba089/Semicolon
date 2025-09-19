<<<<<<< HEAD
import java.util.Scanner;

public class EligibilityForExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();
      
        System.out.print("Enter average score: ");
        double score = input.nextDouble();

        if (attendance >= 75 && score >= 75) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}

User should enter attendance percentage 
Enter average score
Display Eligible for the exam
=======
import java.util.Scanner;

public class EligibilityForExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();
      
        System.out.print("Enter average score: ");
        double score = input.nextDouble();

        if (attendance >= 75 && score >= 75) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}

User should enter attendance percentage 
Enter average score
Display Eligible for the exam
>>>>>>> 89586d463b124ba6700f9daa9e849b5cef5b2fd9
Print