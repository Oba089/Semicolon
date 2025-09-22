import java.util.Scanner;

public class MultiplicationTable {
 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a number: " );
  int num = input.nextInt();

  int count = 0;
  int result = 0;
  int multiply = 0;

  while( count < 12){
  multiply +=1;

  result = num * multiply;
  count ++;
  System.out.printf("%d x %d = %d %n", num, multiply, result);
}
 }
 }
 
  
