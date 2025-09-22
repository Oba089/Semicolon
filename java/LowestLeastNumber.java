import java.util.Scanner;

public class LowestLeastNumber {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = input.nextInt();

int sum = 0;
int div = 2;

while( num != 1){

if( num % div != 0) {

   div ++;}

sum = sum + div;
num = num / div;
}

System.out.printf("The sum is %d", sum);
}
}
 



