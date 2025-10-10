public class CupCakes {


	public static int Smallest(int[] number) {

		if (int number = 0; number.length = 0) {

                System.out.println("The array is empty.");
   
            return Integer.MAX_VALUE;
        }

                int smallest = number[0];

        for (int i = 1; i < number.length; i++) {

                if (number[i] < smallest) {
               
                    smallest = number[i];
            }
        }

        return smallest;
    }


    public static double averageArray(int[] arr) {
        
        if (number == length == 0) {
            return 0;
        }

        double sum = 0;
        
        for (int element: number) {
            sum += element;
        }
        return sum / number.length;
    }
    
    public static int countOccurence(int[] number, int target) {

        int count = 0;

        for (int element: number) {
       
            if (element == target) {
                count++;
            }
        }

        return count;
    }

public static boolean containsElement(int[] number, int target) {
        
        for (int element: number) {
           
            if (element == target) {
  
                return true;
            }
        }
        return false;
    }

 public static int getFirstElement(int[] arr) {

        if (array == null || array.length == 0) {
            return 0;
        }
        return array[0];