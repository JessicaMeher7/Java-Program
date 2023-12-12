//Print first n natural numbers
import java.util.Scanner;

public class First_n_NatualNumbers
{
	public static void main(String [] args)
	{
		System.out.print("Enter a number n = ");
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		reader.close();
		for (int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}