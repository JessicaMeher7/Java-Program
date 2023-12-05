import java.util.Scanner;

public class SimpleAdditionTry
{
	public static void main(String [] args)
	{
		System.out.print("\nEnter a number num1 = ");
		Scanner reader = new Scanner(System.in);
		int num1= reader.nextInt();
		System.out.print("\nEnter a number num2 = ");
		int num2= reader.nextInt();
		reader.close();
		int sum= num1 + num2;
		System.out.println("The sum is " + sum);
	}
}
