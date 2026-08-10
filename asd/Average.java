package asd;
import java.util.Scanner;
public class Average {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
   System.out.println("Average of 3 numbers is: "+((a+b+c)/3));
    sc.close();
        }
      }
        
