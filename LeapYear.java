
import java.util.Scanner;
class LeapYear
{
	public static void main (String args [])
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a year to check");
		int num = sc.nextInt();
		
		if (num%4==0)
		{
				System.out.println("the year is leap year");
		}
		else {
				System.out.println("the year is not a leap year");
		}
	}
}
