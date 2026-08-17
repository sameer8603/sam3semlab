import java.util.Scanner;
public class Linear_Search_2D {
				public static void main(String args[]){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter rows:");
								int rows = sc.nextInt();
								System.out.println("Enter cols:");
								int cols = sc.nextInt();
								int numbers[][] = new int[rows][cols];
								// Input Array
								System.out.println("Enter Array elements: ");
								for(int i=0; i<rows; i++){
												for(int j=0; j<cols; j++){
																numbers[i][j] = sc.nextInt();
												}
								}
								//Input key to find
								System.out.println("Enter key:");
								int x = sc.nextInt();
								// Linear search
								for(int i=0; i<rows; i++){
												for(int j=0; j<cols; j++){
																if(numbers[i][j] == x){
																				System.out.print("Key found at position: ("+ ++i +" , "+ ++j +")");
																}
												}
								}
				}
}