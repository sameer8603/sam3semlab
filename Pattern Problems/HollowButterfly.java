
public class HollowButterfly {
				public static void main(String[] args){
								int n = 5;
								// UPPER PART
								for(int i=1; i<=n; i++){
												// First hollow part
												for(int j=1; j<=i; j++){
																if(j==1 || j==i) System.out.print("*");
																else System.out.print(" ");
												}
												 //Spaces
												int spaces = 2*(n-i);
												for(int j = 1; j<=spaces; j++){
																System.out.print(" ");
												}
												// 2nd Part
												for(int j=1; j<=i; j++){
																if(j==1 || j==i) System.out.print("*");
																else System.out.print(" ");
												}
												System.out.println();
								}
												// LOWER PART
												for(int i=n; i>=1; i--){
												// First hollow part
												for(int j=1; j<=i; j++){
																if(j==1 || j==i) System.out.print("*");
																else System.out.print(" ");
												}
												 //Spaces
												for(int j = 1; j<=2*(n-i); j++){
																System.out.print(" ");
												}
												// 2nd Part
												for(int j=1; j<=i; j++){
																if(j==1 || j==i) System.out.print("*");
																else System.out.print(" ");
												}
																System.out.println();
								}
				}
				}