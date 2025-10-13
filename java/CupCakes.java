1.

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


2.

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
    
3.

public static int countOccurence(int[] number, int target) {

        int count = 0;

        for (int element: number) {
       
            if (element == target) {
                count++;
            }
        }

        return count;
    }


4.

public static boolean containsElement(int[] number, int target) {
        
        for (int element: number) {
           
            if (element == target) {
  
                return true;
            }
        }
        return false;
    }

5.

public static int getFirstElement(int[] arr) {

        if (array == null || array.length == 0) {
            return 0;
        }
        return array[0];


6.

public static int getLastElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1];
    }

7.

public static int countElements(int[] arr) {
        int count = 0;
        try {
            while (true) {
                int temp = arr[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return count;
    }

8.

public static Integer getMiddleElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int midIndex = (arr.length - 1) / 2;
        return arr[midIndex];
    }




9.

public static int[] swapFirstAndLast(int[] arr) {
        if (arr == null || arr.length < 2) {
      
            return arr;
        }

        int[] result = arr.clone();

        int temp = result[0];
        result[0] = result[result.length - 1];
        result[result.length - 1] = temp;

        return result;
    }


