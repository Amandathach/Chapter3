package tutorial;

import java.util.Scanner;

public class NumberDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter a number>>");
		num1 = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.print("Please enter another number>>");
		num2 = inputDevice.nextInt();
		displayTwiceTheNumber(num1, num2);
		
		
		
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * 2;
		secondNumber = y * 2;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	
	public static void displayNumberPlusFive() 
	{
		
	}
	
	public static void displayNumberSquared()
	{
		int i = 2;
		int square = (int) Math.pow(i,  2);
	}

}
