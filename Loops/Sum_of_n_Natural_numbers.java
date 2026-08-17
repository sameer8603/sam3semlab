import java.util.Scanner;
public class Sum_of_n_Natural_numbers {
				public static void main(String[] args){
								int i, sum = 0;
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter number: ");
								int n = sc.nextInt();
								for(i = 0; i <= n; i++){
												sum = sum + i;
								}
								System.out.println("Sum = " + sum);
				}
}