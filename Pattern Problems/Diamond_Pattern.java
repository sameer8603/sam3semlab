
public class Diamond_Pattern {
				public static void main(String[] args){
								int n = 5;
								//UPPER PART
								for(int i=1; i<=n; i++){
												//Spaces
												for(int j=1; j<=n-i; j++){
																System.out.print(" ");
												}
												// Star or Number
												for(int j=1; j<=2*i-1; j++){
																System.out.print("*");
												}
												System.out.println();
								}
											//LOWER PART
								for(int i=n; i>=1; i--){
												//Spaces
												for(int j=1; j<=n-i; j++){
																System.out.print(" ");
												}
												// Star or Number
												for(int j=1; j<=2*i-1; j++){
																System.out.print("*");
												}
												System.out.println();
								}
				}
}