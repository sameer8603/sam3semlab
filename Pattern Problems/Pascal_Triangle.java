
public class Pascal_Triangle {
				public static void main(String[] args){
								int n = 5;
								for(int i=0; i<n; i++){
												//  Space
												for(int j=0; j<n-i-1; j++){
																System.out.print(" ");
												}
												// Right part
												int num = 1;
												for(int j=0; j<=i; j++){
																System.out.print(num+" ");
																num = num*(i-j)/(j+1);
												}
												System.out.println();
								}
				}
}