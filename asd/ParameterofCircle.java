package asd;
import java.util.Scanner;
public class ParameterofCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print(" Enter Radius: ");
         double r = sc.nextDouble();
         System.out.println("Area = " + (3.1428*r*r));
         System.out.println("Perimeter = " + (2*3.1428*r));
         sc.close();
    }
}
