// Program to find the greatest among three numbers
import java.util.Scanner;

public class GreatestThree
{
	public static void main(String [] args)
	{
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter Three numbers ");
		System.out.print("\nEnter a number A= ");
		int n1 = reader.nextInt();
		System.out.print("\nEnter a number B= ");
		int n2 = reader.nextInt();
		System.out.print("\nEnter a number C= ");
		int n3 = reader.nextInt();
		reader.close();
		if (n1 > n2)
		{
			if (n1 > n3)
				{
					System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n1);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3  + " is " + n3);
				}
		}
		else
		{
			if (n2 > n3)
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n2);
				}
			else
				{
					System.out.println("Greatest among " + n1 + ", " + n2 + " and " + n3 + " is " + n3);
				}
		}
	}
}


;
		