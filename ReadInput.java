import java.util.Scanner;

public class ReadInput
{
	public static void main(String args[])
	{
		System.out.print("\n Enter a number = ");
		Scanner reader = new Scanner(System.in);  // Scanner is Constructor. This is object Creation.
		int num = reader.nextInt();
		System.out.println("\nEntered number is " + num);

	}
}