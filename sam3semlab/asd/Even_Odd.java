package asd;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();
      if(n%2 == 0){
        System.out.println(n+" is an Even number");
      } else {
        System.out.println(n+" is an Odd number");
      }
      sc.close();
    }
}
