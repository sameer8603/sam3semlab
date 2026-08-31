import java.util.Scanner;
public	class ArrayDisplay {
    public static void main(String[] args) {
      
            Scanner sc = new Scanner(System.in);
				System.out.println("Enter size:");
				int size = sc.nextInt();
				int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 10;
        }
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
