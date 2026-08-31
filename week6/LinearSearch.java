public class LinearSearch {
     public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int key = 50;
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
