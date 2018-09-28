import java.util.Scanner;

public class Question6 {
	
	int num,fact=0;
	
	public int FirstFactorial(int num)
	{
		if(num==1)
			return 1;
		else
		{
			for(int i=num-1;i>0;i--) 
			{
				fact=num*FirstFactorial(num-1);
			}
			return fact;
		}
	}


	public static void main(String[] args) {
		
		Question6 q=new Question6();
		Scanner s = new Scanner (System.in);
		
		System.out.println("ENTER VALUE");
		q.num=s.nextInt();
		s.close();
		int a=0;
		a=q.FirstFactorial(q.num);
		
		System.out.println("Factorial Value: "+a);
		


	}

}
