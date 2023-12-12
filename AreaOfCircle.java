//AREA OF CIRCLE
import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String [] args)
	{	
		System.out.print("Enter the radius of circle : ");
		Scanner reader = new Scanner(System.in);
		double radius= reader.nextDouble();
		reader.close();
		double Area= (3.14*radius*radius);
		System.out.print("The Area of circle : "+Area);
	}
}