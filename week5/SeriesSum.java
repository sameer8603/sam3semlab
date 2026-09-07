import java.util.Scanner;

public class SeriesSum {
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double sum = 0;
         System.out.println("Enter number: ");
         int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sum += 1.0/(i+1);
        } System.out.println("Sum of series = "+sum);
 }
}
