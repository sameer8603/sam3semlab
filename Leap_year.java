
public class Leap_year {
				public static void main(String[] args){
								int leap = 2024;
								if((leap%400 == 0) || (leap%4 == 0 && leap%100 != 0) )
												System.out.println(leap+" is a Leap year");
								else 
												System.out.println(leap+" is Not a leap year");
				}
}