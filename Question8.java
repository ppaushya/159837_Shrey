
import java.util.Scanner;

public class Question8 {
	
	public void anagram1(String str1,String str2) {
		char[] arr1=new char[str1.length()];
		char[] arr2=new char[str2.length()];
		
		for(int i=0;i<str1.length();i++)
		{
			arr1[i]=str1.charAt(i);
		}
		
		for(int i=0;i<str2.length();i++)
		{
			arr2[i]=str2.charAt(i);
		}
		
	if(str1.length()!=str2.length())
	System.out.println("not an anagram");
	
	char temp;
	for(int i=0;i<str1.length();i++)
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]>arr1[j])
			{
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				
			}
				
		}
	}
	
	for(int i=0;i<str2.length();i++)
	{
		for(int j=i+1;j<arr2.length;j++)
		{
			if(arr2[i]>arr2[j])
			{
				temp=arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=temp;
				
			}
				
		}
	}
		
	for(int i=0;i<str2.length();i++)
	{
		if(arr1[i]!=arr2[i])
			{System.out.println("not an anagram");
			break;
			}	
		else
			{System.out.println("anagram");
		break;}
	}
		
		
	}

	public static void main(String[] args) {
		Question8 obj=new Question8();
		Scanner s=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter a string");
		str1=s.nextLine();
		System.out.println("Enter another string");
		str2=s.nextLine();
		obj.anagram1(str1,str2);

	}

}