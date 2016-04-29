package com;

import java.util.Scanner;


public class OddorEven {
	
	
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
	    Integer number;
	    int answer;
	    int minus;
	    double division;
		System.out.println("Odd or Even");
		
		System.out.println("Please Enter a number:");  
		number=c.nextInt();
		if(number%2==0)
		{
			System.out.println("The number " + number + " is even");
		}
		else
		{
			System.out.println("The number " + number +" is odd");
		}
		 answer=add(5,3);	
		 System.out.println("The answer is : " + answer);
		 minus=sub(5,3);	
		 System.out.println("The minus is : " + minus);
		 //test for conflict
		 division=div(5,3);	
		 System.out.println("The division is : " + division);
		
	}
	private static int add(int a,int b)
	{
	return a+b;
	}
	private static int sub(int a,int b)
	{
	return a-b;
	}
	//test conflict gayathri 
	private static double div(int a,int b)
	{
	return a/b;
	}
	//test conflict gayathri1 
}
