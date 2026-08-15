import java.util.Scanner;
public class Arrays_2D {
				public static void main(String args[]){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter rows:");
								int rows = sc.nextInt();
								System.out.println("Enter columns:");
								int cols = sc.nextInt();
								int numbers[][] = new int[rows][cols];
								// Input Array
								System.out.println("Enter Array elements:");
								//Rows
								for(int i=0; i<rows; i++){
												//Cols
												for(int j=0; j<cols; j++){
																numbers[i][j] = sc.nextInt();
												}
								}
								// Transpose & Print Array
								System.out.println("Transpose of array:");
								for(int i=0; i<cols; i++){
												for(int j=0; j<rows; j++){
																System.out.print(numbers[j][i]+" ");
												}
												System.out.println();
								}
				}
}