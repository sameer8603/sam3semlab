import java.util.Scanner;
public class Fibonacci_Series {
				public static int fibbonaci(int n){
								int ct = 0, nt = 1, nnt;
								int sum = 0;
								for(int i=1; i<=n; i++){
												System.out.print(ct+" ");
													sum = sum + ct;
												nnt = ct + nt;
												ct = nt;
												nt = nnt;
								}
								return sum;
				}
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								int n = sc.nextInt();
								int sum = fibbonaci(n);
								System.out.println();
								System.out.print("Sum is: "+sum);
				}
}