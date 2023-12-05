import java.util.Scanner;

public class EvenOdd
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number : ");
		Scanner reader = new Scanner(System.in);
		int num= reader.nextInt();
		reader.close();
		if(num%2==0)
		{
			System.out.println(num + " is Even");
		}
		else
		{
			System.out.println(num + " is Odd");
		}
	}
}
