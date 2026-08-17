import java.util.Scanner;
public class MarksMenu {
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								int choice;
								do{
												System.out.println("Enter 1(continue) or 0(stop):");
											choice = sc.nextInt();
												System.out.println("Enter Marks:");
												int marks = sc.nextInt();
												if(marks>=90 && marks<=100) System.out.println("Good Marks");
												else if(marks>=60 && marks<=89)
																System.out.println("This also good");
																else if(marks>=0 && marks<=59)
																				System.out.println("This is good as well");
																				else System.out.println("Invalid marks!");
								}while(choice != 0);
				}
}