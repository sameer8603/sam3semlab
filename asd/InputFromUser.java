package asd;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double a = sc.nextDouble();
        System.out.println(a);
        sc.close();
    }
}

