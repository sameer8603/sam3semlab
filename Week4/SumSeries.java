package Week4;
import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        sum = n*(n+1)/2;

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
