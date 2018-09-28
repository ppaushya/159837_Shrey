import java.util.Scanner;

public class Ques2 {
	
	public void alphabetsoup(String str)
	{
		for(int i=0;i<str.length();i++)
			{
				for(int j=i;j<str.length();j++)
				{
					if(str.charAt(i)>str.charAt(j))
					{
						char k=str.charAt(i);
						str.charAt(i)=str.charAt(j);
						str.charAt(j)=k;					
					}
				}
			System.out.println(str.charAt(i));
		}
	}
	

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=new String();
		
		Ques2 ob=new Ques2();
		
		System.out.println("Enter a String : ");
		str=s.nextLine();
		ob.alphabetsoup(str);
		
		

}
}