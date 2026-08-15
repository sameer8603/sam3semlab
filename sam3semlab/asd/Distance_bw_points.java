package asd;
import java.util.Scanner;
public class Distance_bw_points {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter coordinates of 1st point: ");
        double x1 = sc.nextDouble();
         double y1 = sc.nextDouble();
       System.out.print("Enter coordinates of 2nd point: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
       double d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
       System.out.println("Distance between two points is: "+d);
      sc.close();
    }
}
