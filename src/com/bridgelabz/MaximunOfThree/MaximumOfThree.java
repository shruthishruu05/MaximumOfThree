package com.bridgelabz.MaximunOfThree;
import java.util.*;
	public class MaximumOfThree<E extends Comparable<E>> {
		
		E data1, data2, data3;
		
		public MaximumOfThree(E data1, E data2, E data3) {
			this.data1 = data1;
			this.data2 = data2;
			this.data3 = data3;
		}
		
		public E maximum() {
			return maximum(data1, data2, data3);
		}
		
		private static <E extends Comparable<E>> E maximum(E data1, E data2, E data3) {
			E max = data1;
			
			if(data2.compareTo(max)>0) {
				max = data2;
			}
			if(data3.compareTo(max)>0) {
				max = data3;
			}
			return max;
		}
		
		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			while(true) 
			{
				System.out.println("Choose any option 1: To comapre the integers 2: To compare floating point numbers 3:To copmare strings");
				switch(scanner.nextInt()) 
				{
					case 1:
						System.out.println("Enter  any three integers");
						int num1 = scanner.nextInt();
						int num2 = scanner.nextInt();
						int num3 = scanner.nextInt();
						int maxOfInt =maximum(num1,num2,num3);
						System.out.println("the maximum integer is :"+maxOfInt);
						break;
					case 2:
						System.out.println("Enter any three Floating point numbers");
						float floatNumber1 = scanner.nextFloat();
						float floatNumber2 = scanner.nextFloat();
						float floatNumber3 = scanner.nextFloat();
						float maxOfFloat =maximum(floatNumber1,floatNumber2,floatNumber3);
						System.out.println("the maximum integer is :"+maxOfFloat);
						System.out.println("the maximum Floating point numbers is :"+maxOfFloat);
						break;
					case 3:
						System.out.println("Enter any three strings");
						String data1 = scanner.next();
						String data2 = scanner.next();
						String data3 = scanner.next();
						String maxOfString = maximum(data1,data2,data3);
						System.out.println("the largest string based on compareTo is :"+maxOfString);
						break;
					}
				}
			}
		}
	   

