import java.util.Scanner;
public class CalculatorUsingSwitch {
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter a and b: ");
								int a = sc.nextInt();
								int b = sc.nextInt();
								System.out.println("Enter operator: ");
								char ch = sc.next().charAt(0);
								switch(ch){
												case '+': int sum = a + b;
												System.out.println("Sum: " + sum); break;
												case '-': int diff = a - b;
												System.out.println("Difference: " + diff); break;
												case '*': int mul = a * b;
												System.out.println("Multiplication: " + mul); break;
												case '/': if(a < 0 || b < 0 || a < b){
																System.out.println("Division is zero!");} else{
																				int div = a / b;
																				System.out.println("Division: " + div);
																} break;
												default : System.out.println("Invalid operator! ");
								}
				}
}