package asd;
import java.util.Scanner;
public class compare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
         double b = sc.nextDouble();
         double temp = a;
          a = b;
          b = temp;
          System.out.println("After swap: " + a +  " " + b);
          sc.close();
    }
}
