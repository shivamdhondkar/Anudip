
import java.util.Scanner;
class EvenOdd
{
	public static void main (String args [])
	{
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0)
		{
			System.out.println("the number is even");
		}
		else{
			System.out.println("the number is odd");
		}
		
	}
}