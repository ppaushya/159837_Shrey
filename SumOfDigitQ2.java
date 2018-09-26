package org.cap.loop.demo;

import java.util.Scanner;

public class SumOfDigitQ2 {

	public static void main(String[] args) {

		int num,n,a,sum=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number ");
		num=s.nextInt();
		n=num;
		
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			sum=sum+a;
		}
		
		System.out.println("Sum of the number is "+ sum);
	}

}
