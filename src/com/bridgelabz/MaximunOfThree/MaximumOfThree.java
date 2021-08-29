package com.bridgelabz.MaximunOfThree;

public class MaximumOfThree 
{
	public static void main(String args[])
	{
	      int number1 = 10;
	      int number2 = 55;
	      int number3 = 17;
	      if (number1 >= number2 && number1 >= number3)
	      {
	         System.out.println( number1 + " is the maximum number.");
	      }
	      else if (number2 >= number1 && number2 >= number3)
	         System.out.println( number2 + " is the maximum number.");
	      else
	         System.out.println( number3 + " is the maximum number.");
	}
}
	

