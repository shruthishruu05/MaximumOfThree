package com.bridgelabz.MaximunOfThree;

public class MaximumOfThree {
	public static <E extends Comparable<E>> E maximum(E number1, E number2, E number3)
	{
	    E maximumAmongThree = number1; 
	    if (number2.compareTo(maximumAmongThree) > 0)
	    	maximumAmongThree = number2; 
	    if (number3.compareTo(maximumAmongThree) > 0)
	    	maximumAmongThree = number3; 

	    return maximumAmongThree;   
	}

	  public static void main(String args[]) 
	  {
		  int number1=5;
		  int number2=9;
		  int number3=7;
		  
	    System.out.printf("Maximum of three " +number1+ " , " +number2+ " , "+number3+ " is " + maximum(number1,number2,number3));
	  }
	   
}
