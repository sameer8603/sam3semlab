
public class pattern {
    public static void main(String[] args){
        int n = 5;
       //Outer loop
        for(int i = 1; i <= n; i++){
           //spaces
            for(int j = 1; j <= n-i; j++){
              System.out.print(" ");
           } 
           // number pattern with spaces
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
