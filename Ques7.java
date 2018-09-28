import java.util.Scanner;

public class Ques7 {
	
	public void longestword(String str)
	{
		char[] arr=new char[str.length()+1];
		//char[] temp=new char[];
		arr[str.length()]=' ';
		
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		
		int s=0,k=0,index=0;
		for(int i=0;i<=str.length();i++)
		{
			s++;
		    if(arr[i]==' ' )
		    {
		       if(s>k)
		       {
		    	   index=i-s;
		    	   k=s;
		    	   
		       }
		       s=0;
		    }
		}
		
		for(int i=index+1;i<k+index;i++)
			System.out.print(arr[i]);
		
	
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String str=new String();
		
		Ques7 ob=new Ques7();
		
		System.out.println("Enter a String : ");
		str=s.nextLine();
		
		ob.longestword(str);
	}

}
