1.

public class EvenNumbers {
    public static void main(String[] args) {
        for (int a = 2; a <= 100; a += 2) {
            System.out.print(a + " ");
        }
    }
}

2.

public class OddNumbers {
    public static void main(String[] args) {
        for (int a = 51; a < 100; a += 2) {
            System.out.println(a);
        }
    }
}

3.

public class Countdown {
    public static void main(String[] args) {
        for (int a = 100; a >= 1; a--) {
            System.out.println(a);
        }
    }
}

4.

public class SquareNumbers {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            System.out.println("Square of " + a + " is " + (a * a));
        }
    }
}

5.

public class MultiplesOfThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

6.

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

7.

public class CountDivisibleBy7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers divisible by 7 between 1 and 100: " + count);
    }
}

8.

public class SumFirst50Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of the first 50 natural numbers: " + sum);
    }
}

9.

public class ProductFirst10Numbers {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of the first 10 natural numbers: " + product);
    }
}

10.

public class PrintLetters {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

11.

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;  // Change this number to print a different table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

12.

public class PrintCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

13.

public class CountE {
    public static void main(String[] args) {
        String input = "Here is an example sentence.";
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                count++;
            }
        }
        
        System.out.println("Number of 'e's: " + count);
    }
}

14.

public class LowerToUpper {
    public static void main(String[] args) {
        String input = "Hello World!";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                c = (char) (c - 32);
            }
            result.append(c);
        }

        System.out.println(result.toString());
    }
}

15.

public class ToLowerManual {
    public static void main(String[] args) {
        String input = "HeLLo WoRLD!";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if uppercase A-Z
            if (c >= 'A' && c <= 'Z') {
                // Convert to lowercase by adding 32
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Lowercase: " + result.toString());
    }
}

16.

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Hello World!";
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Number of vowels: " + count);
    }
}

17.

public class DigitCounter {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number: " + number);
        System.out.println("Digit count: " + count);
    }
}

18.

public class DigitSum {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

19.

public class LargestDigit {
    public static void main(String[] args) {
        int number = 739245;
        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Largest digit: " + maxDigit);
    }
}

20.

public class SmallestDigit {
    public static void main(String[] args) {
        int number = 739245;
        int minDigit = 9; // max digit possible

        while (number > 0) {
            int digit = number % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Smallest digit: " + minDigit);
    }
}




