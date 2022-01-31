package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.DS.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String to check the balanced nature");
		String str = sc.next();
		boolean result =false;
		
		BalancingBrackets balancingBrackets =new BalancingBrackets(str);
		
		result =balancingBrackets.checbraceSeq();
		
		if(result == true)
		{
			System.out.println("The Entered String  contain balanced Brackets");
		}
		
		else
		{
			System.out.println("The Entered String do not contains balanced Brackets");
		}
		
		

	}

}
