import java.util.Scanner;
public class CalculatorUsingIfelseIf {
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter a and b: ");
								int a = sc.nextInt();
								int b = sc.nextInt();
								System.out.println("Enter operator: ");
								char ch = sc.next().charAt(0);
								if(ch == '+'){
												int sum = a + b;
												System.out.println("Sum: " + sum);
								}
								else if(ch == '-'){
												int diff = a - b;
												System.out.println("Differnce: " + diff);
								}
												else if(ch == '*'){
																int mul = a * b;
												System.out.println("Multiplication: " + mul);
												} else if(ch == '/'){
																if(a < 0 || b < 0 || a < b) System.out.println("Division is 0");
																else{
																				int div = a / b;
								System.out.println("Division: " + div);
																}
												}
								else{
												System.out.println("Enter valid operator!");
								}
				}
}