package com;

import java.util.Scanner;

public class OddorEven {
	
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
	    Integer number;
	    //String choice;
		System.out.println("Odd or Even");
		
		System.out.println("Please Enter a number:");  
		number=c.nextInt();
		if(number%2==0)
		{
			System.out.println("The number " + number + " is even");
			int answer=multiply(number);
			System.out.println(answer);
		}
		else
		{
			System.out.println("The number " + number +" is odd");
		}
		
	}
	private static int multiply(int number){
		return number*2;
	}

}
