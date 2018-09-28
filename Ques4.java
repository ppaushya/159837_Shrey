import java.util.Scanner;

public class Ques4 {
	
	public void letterchange(String str)
	{
		char[] arr=new char[str.length()];
		char temp;
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++)
		{
			if((arr[i])=='a' || (arr[i])=='e' ||(arr[i])=='i'||(arr[i])=='o'||(arr[i])=='u')
				arr[i]=(char)(arr[i]-32);
			else if(arr[i]=='z')
				arr[i]='a';
			else if(arr[i]==' ')
				arr[i]=' ';
			else
				arr[i]=(char)(arr[i]+1);
		
			
		}
		for(int i=0;i<str.length();i++)
			System.out.print(arr[i]);
	}

	public static void main(String[] args) 
	{
         Ques4 ob=new Ques4();
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=s.nextLine();
		
		ob.letterchange(str);
		
		
	}

}