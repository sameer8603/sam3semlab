import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int sum = 0, digit;
         System.out.println("Enter number: ");
         int n = sc.nextInt();
         while(n > 0){
            digit = n % 10;
            sum += digit;
            n /= 10;
         } System.out.println("Sum of digits = "+sum);
         sc.close();
 }
}
