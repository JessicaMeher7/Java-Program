//Quadratic_EqnSolver

import java.util.Scanner;
import java.lang.Math;

public class Quadratic_EqnSolver
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the a,b and c values of the quadratic equation ax^(2)+bx+c=0 ");
		System.out.print("Enter the a value : ");
		double a=reader.nextDouble();
		System.out.print("Enter the b value : ");
		double b=reader.nextDouble();
		System.out.print("Enter the c value : ");
		double c=reader.nextDouble();
      		double r1=((-b+ (Math.sqrt(b*b-(4*a*c))))/(2*a));
		double r2=((-b- (Math.sqrt(b*b-(4*a*c))))/(2*a));
		System.out.println("Root 1 : "+r1);
		System.out.println("Root 2 : "+r2);
	}
}

