import java.util.Scanner;
public class Simple_Calculator
{
	public static void main(String [] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter two numbers : ");		
		int a=reader.nextInt();
		int b=reader.nextInt();
		System.out.print("Enter the Operator : ");
		char opp=reader.next().charAt(0);
		switch(opp)
		{	
			case '+':
					int Add=a+b;
					System.out.print("Addition of a&b : "+Add);
					break;
			case '-':
					int Sub=a-b;
					System.out.print("Subraction of a&b : "+Sub);
					break;
			case '*':
					int Mul=a*b;
					System.out.print("Multiplication of a&b : "+Mul);
					break;
			case '/':
					int Div=a/b;
					System.out.print("Division of a&b : "+Div);
					break;

		}
	}
}