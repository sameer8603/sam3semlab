import java.util.Scanner;
public class Name_Sum_Prod_Fact {
				public static void printMyName(String name){
								System.out.println("My Name is: " + name);
								return;
				}
				public static double calculateSum(double a,double b){
								return a+b;
				}
				public static double calculateProduct(double a,double b){
								return a*b;
				}
								public static long factorial(int n){
												int fact = 1;
												if(n<0) return -1;
																else {
																				for(int i=1; i<=n; i++){
																								fact = fact*i;
																				}
				return fact;
																}
								}
								public static void main(String args[]){
												Scanner sc = new Scanner(System.in);
			System.out.println("Enter a and b: ");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
												sc.nextLine();
				System.out.println("Enter name: ");
				String sentence = sc.nextLine();
											System.out.println("Enter n:");
												int n = sc.nextInt();
				printMyName(sentence);
			System.out.println("Sum is: "+			calculateSum(a,b));
				System.out.println("Product is: "+calculateProduct(a,b));
				long fact = factorial(n);
												if(fact == -1) System.out.println("Invalid input!");
												else System.out.println("Factorial is: "+fact);
												sc.close();
								}
}