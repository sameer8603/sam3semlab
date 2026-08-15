
public class Inverted_HalfPyramid {
				public static void main(String[] args){
								int n = 5;
								for(int i=n; i>=1; i--){
												for(int j=1; j<=i; j++){
																if(i==1) System.out.print("5");
																else if(i==2) System.out.print("4");
																				else if(i==3)
																								System.out.print("3");
																								else if(i==4)
																												System.out.print("2");
																												else if(i==5)
																																System.out.print("1");
																																else System.out.print("Ivalid!");
												}
												System.out.println();
								}
				}
}