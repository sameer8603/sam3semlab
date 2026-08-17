import java.util.Scanner;
public class TablePrint {
				public static void printTable(int n){
								System.out.println("Table of "+n);
								for(int i=1; i<=10; i++){
												System.out.println(n*i);
								}
				}
				public static void main(String[] args){
								Scanner sc = new Scanner(System.in);
								System.out.println("Enter n: ");
								int n = sc.nextInt();
								printTable(n);
				}
}