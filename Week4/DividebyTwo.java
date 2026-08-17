package Week4;
import java.util.Scanner;

public class DividebyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        while (n >= 10) {
            n = n / 2;
            if (n >= 10){
            System.out.println(n);
            }
        }
         sc.close();
    }
}