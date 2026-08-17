import java.util.Scanner;
public class Permutations_Combinations {
				public static long fact(int n){
								int fact = 1;
								if(n<0) fact = -1;
								else if(n<=1) fact = 1;
												else{
																for(int i=2; i<=n; i++){
																				fact += i;
																}
												}
								return fact;
				}
				public static long permatuation(int n, int r){
						long		permatuation = fact(n)/fact(n-r);
								return permatuation;
				}
				public static long combination(int n, int r){
								long combination = fact(n)/(fact(r)*fact(n-r));
								return combination;
				}
	public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
					int choice, n, r;
					do{
														System.out.println("Enter n: ");
					 n = sc.nextInt();
					System.out.println("Enter r: ");
					 r = sc.nextInt();
									System.out.println("Enter your choice(1 or 2):");
					choice = sc.nextInt();
									if(choice == 1) System.out.println("Permatuation: "+permatuation(n,r));
					else if(choice == 2) System.out.println("Combination: "+combination(n,r));
									else System.out.println("Enter valid choice!");
					}while(choice != 0);
				}
}