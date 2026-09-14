import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size: ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter Array elements: ");
       for(int i = 0; i<n; i++){
         arr[i] = sc.nextInt();
       }
       System.out.println("Enter key to find: ");
       int key = sc.nextInt();
       int lb = 0, ub = n-1;
       int result = Binary(arr, lb, ub, key);
        if(result != -1) System.out.println(key+" found at "+result+" index ");
        else System.out.println("Key not found");
        sc.close();
 }
 public static int Binary(int arr[], int lb, int ub, int key){
    int mid;
    while(lb<=ub){
        mid = lb + (ub - lb)/2;
        if(arr[mid] == key){ return mid;}
        else if(arr[mid] < key) lb = mid + 1;
        else ub = mid - 1;
     }
     return -1;
    }
 }
