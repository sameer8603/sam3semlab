
public class SwapArray {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        System.out.println("Array before swap: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
      System.out.println();
        //Swap
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
       System.out.println("Array after swap: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
