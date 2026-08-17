import java.util.Scanner;
public class Comparison {
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.print("Enter a and b: ");
								int a = sc.nextInt();
								int b = sc.nextInt();
								if(a == b){
												System.out.println("Equal");
								} else{
												if(a > b){
																System.out.println("A is greater");
												} else{
																System.out.println("A is lesser");
												}
								}
				}
}