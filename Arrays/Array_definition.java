import java.util.Scanner;
public class Array_definition {
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter size:");
								int size = sc.nextInt();
								int numbers[] = new int[size];
						//		int[] marks = new int[3];
							//	int marks[] = new int[3];
					//int marks[] = {95,98,97};
				/*		marks[0] = 95;
								marks[1] = 98;
								marks[2] = 97;
								System.out.println(marks[0]);
									System.out.println(marks[1]);
									System.out.println(marks[2]);*/
								System.out.println("Enter Array elements:");
								for(int i=0; i<size;i++){
												numbers[i] = sc.nextInt();
								}
								System.out.println("Enter x:");
								int x = sc.nextInt();
								for(int i=0; i<numbers.length; i++){
												if(numbers[i] == x)
													System.out.println("X found at index: "+i);
								}
				}
}