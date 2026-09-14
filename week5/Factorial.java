import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int fact = 1;
         System.out.println("Enter number: ");
         int n = sc.nextInt();
         for(int i = 2; i <= n; i++){
            fact *= i;
         } System.out.println("Factorial of "+n+" is "+fact);
         sc.close();
 }
}
