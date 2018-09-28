import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		int chk=1,num,a=0;
		System.out.println("Enter aa number : ");
		num=s.nextInt();
		
		int[] prime=new int[num];
		
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0)
					chk++;
			}
			if(chk==1)
				{
				  prime[i-2]=i;
				  System.out.print(i + " ");
				  a++;
				}
			chk=1;
		}
		
		System.out.println();
		
		
		for(int i=2 ; i<a;i++)
		{
			int c=num;
			
			for(int j=2;j<a;j++)
			{
				
				if(c%prime[i-2]==0)
				{
				  System.out.print(prime[i-2] + " ");
				  c=c/prime[i-2];				   
				}
				else
					break;
			}
		}

	}

}
