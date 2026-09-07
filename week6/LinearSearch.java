public class LinearSearch {
     public static void main(String[] args){
        int arr[] = {10,203,30,40,502,60};
        int key = 5020;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println(key+" found at "+i+" index ");
                found = true; break;
            }
        }
        if(!found) System.out.println("Key not found");
     }
}
