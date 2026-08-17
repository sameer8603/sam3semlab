package asd;
import java.util.Scanner;
public class table_print {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Table of "+num+" is: ");
        for(int i = 1; i <= 10; i++){
           System.out.println((num*i));
        }
       sc.close();
    } 
}
