package org;
/*
 * @author
 * Upasana
 */
import java.util.Scanner;

public class Calculator {
	int x; 
	int y;
	
	/*
	 * this adds two numbers
	 * @param int
	 * @param  int
	 * @return int
	 * */
	public int plus()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		x=scn.nextInt();
		System.out.println("Enter second number");
		y=scn.nextInt();
		return x+y;
	}
	public int minus()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		x=scn.nextInt();
		System.out.println("Enter second number");
		y=scn.nextInt();
		return x-y;
	}	
	public int division()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		x=scn.nextInt();
		System.out.println("Enter second number");
		y=scn.nextInt();
		return x/y;
	}
	public int multiply()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first no.");
		x=scn.nextInt();
		System.out.println("Enter second number");
		y=scn.nextInt();
		return x*y;
	}
}
