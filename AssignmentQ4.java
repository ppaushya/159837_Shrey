package org.cap.loop.demo;

public class AssignmentQ4 {

	public static void main(String[] args) {
      String a="Hello";
  
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>=j)
					{
					System.out.print("  " + a.charAt(j));
					}
				
			}
		
		 System.out.println();
		}


	}

}
