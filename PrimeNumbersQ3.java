package org.cap.loop.demo;

public class PrimeNumbersQ3 {

	public static void main(String[] args) {
		
		int chk=1;
		
		for(int i=2;i<=1000;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0)
					chk++;
			}
			if(chk==1)
				System.out.print(i + " ");
			chk=1;
		}

	}

}
