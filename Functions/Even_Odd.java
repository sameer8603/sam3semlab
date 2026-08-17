import java.util.Scanner;
public class Even_Odd {
				public static boolean evenOdd(int n){
								boolean isEven = true;
								if(n%2 == 0) isEven = true;
								else isEven = false;
								return isEven;
				}
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter n: ");
								int n = sc.nextInt();
								if(evenOdd(n)) System.out.println("Number is even");
								else System.out.println("Number is odd");
				}
}