1.

public class SmallestNumber {

 public static void main(String[] args) {
        
        int[] number = {8, 10, 5, 7, 9, 2, 4};

        int result = Smallest(number);

        System.out.println("The smallest element is: " + result);
    }
}

2.

public class ArrayAverage {
 
  public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("The average is: " + averageArray(number));
    }
}

3.

public class CountOccurrences {
  public static void main(String[] args) {

        int[] numbers = {1, 5, 3, 5, 2, 5, 8, 5};
        int target = 5;
        
        int result = countOccurence(numbers, target);
        
        System.out.println("The number " + target + " appears " + result + " times.");
      
    }
}

4.

public class ArrayContainsElement {

	public static void main(String[] args) {
        	int[] numbers = {10, 20, 30, 40, 50};
        	int target1 = 30;
        	int target2 = 99;

 System.out.println("Does the array contain " + target1 + "? " + containsElement(numbers, target1));
       
 System.out.println("Does the array contain " + target2 + "? " + containsElement(numbers, target2));
        }
}

5.

public class GetFirstElement {

  public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] emptyArray = {};

 System.out.println("First element of numbers: " + getFirstElement(numbers));
  
 System.out.println("First element of emptyArray: " + getFirstElement(emptyArray));
  
    }
}


6.

public class Main {

  public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {};

        System.out.println(getLastElement(array1)); 
        System.out.println(getLastElement(array2)); 
    }
}


7.

public class Main {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {};

        System.out.println(countElements(array1)); 
        System.out.println(countElements(array2)); 
    }
}

8.

public class MiddleElement {

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3};
        int[] example2 = {1, 2, 3, 4};
        int[] example3 = {};
        
        System.out.println(getMiddleElement(example1)); 
        System.out.println(getMiddleElement(example2)); 
        System.out.println(getMiddleElement(example3)); 
    }
}


9.

public class SwapFirstLast {


public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] swapped = swapFirstAndLast(original);

        System.out.print("Swapped array: ");
        for (int num : swapped) {
            System.out.print(num + " ");
        }
    }
}

