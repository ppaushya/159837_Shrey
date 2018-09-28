import java.util.Scanner;

public class Question5 {

	public void reverseorderstring(String str)
	{
		char[] arr=new char[str.length()];
		char temp;
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		
		int start=0,end=str.length()-1;
		char flag;
		
		while(start<end)
		{
			flag=arr[start];
			arr[start]=arr[end];
			arr[end]=flag;
			start++;
			end--;
		}
		
		/*
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length()/2;i++)
		   {
			 temp=arr[i];
			 arr[i]=arr[str.length()-i-1];
			 arr[str.length()-i-1]=temp;
	       }
		}
		else
		{
			for(int i=0;i<(str.length()/2);i++)
			   {
				  temp=arr[i];
				 arr[i]=arr[str.length()-i-1];
				 arr[str.length()-1]=temp;
		       }
		}*/
		
		for(int i=0;i<str.length();i++)
		System.out.print(arr[i]);
	}
	public static void main(String[] args) 
	{
		Question5 ob=new Question5();
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=s.nextLine();
		
		ob.reverseorderstring(str);

	}

}
