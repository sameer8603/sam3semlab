package Week4;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();
    String result = (n % 2 == 0) ? "Even number" : "Odd number";
    System.out.println(n+" is an "+result);
      sc.close();
    }
}