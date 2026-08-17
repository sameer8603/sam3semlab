import java.util.Scanner;
public class ParametersOfCircle {
				public static void main(String[] args){
								double pi = 3.1428;
								Scanner sc = new Scanner(System.in);
								System.out.print("Enter Radius of the circle: ");
								int r = sc.nextInt();
								double area = pi*r*r;
								double perimeter = 2*pi*r;
								System.out.println("Area=" + area);
								System.out.println("Perimeter=" + perimeter);
								
				}
				
}