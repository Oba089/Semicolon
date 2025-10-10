public class SmallestNumber {

 public static void main(String[] args) {
        
        int[] number = {8, 10, 5, 7, 9, 2, 4};

        int result = Smallest(number);

        System.out.println("The smallest element is: " + result);
    }
}

public class ArrayAverage {
 
  public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("The average is: " + averageArray(number));
    }
}

public class CountOccurrences {
  public static void main(String[] args) {

        int[] numbers = {1, 5, 3, 5, 2, 5, 8, 5};
        int target = 5;
        
        int result = countOccurence(numbers, target);
        
        System.out.println("The number " + target + " appears " + result + " times.");
      
    }
}

public class ArrayContainsElement {

	public static void main(String[] args) {
        	int[] numbers = {10, 20, 30, 40, 50};
        	int target1 = 30;
        	int target2 = 99;

 System.out.println("Does the array contain " + target1 + "? " + containsElement(numbers, target1));
       
 System.out.println("Does the array contain " + target2 + "? " + containsElement(numbers, target2));
        }
}

public class GetFirstElement {

  public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] emptyArray = {};

 System.out.println("First element of numbers: " + getFirstElement(numbers));
  
 System.out.println("First element of emptyArray: " + getFirstElement(emptyArray));
  
    }
}