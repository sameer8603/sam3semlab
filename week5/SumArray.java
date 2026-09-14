import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int sum = 0;
				System.out.println("Enter size:");
				int size = sc.nextInt();
				int arr[] = new int[size];
               System.out.println("Enter Array elements: ");
                for(int i =0; i < size; i++){
                    arr[i] = sc.nextInt();
                }
                for(int i = 0; i < size; i++){
                    sum += arr[i];
                }
                System.out.println("Sum of Array elements = "+sum);
                sc.close();
    }
}
