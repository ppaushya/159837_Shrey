import java.util.Scanner;
 
public class Ques3 {
 
public String LetterCapitalize(String str)
{
char ch[]=new char[str.length()];
 
int i,j;
 
char temp;
 
for(i=0;i<str.length();i++)
{
ch[i]=str.charAt(i);
}
 
 
for(i=0;i<str.length();i++)
{
// If first character of a word is found 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') 
   { 
 
                // If it is in lower-case 
                if (ch[i] >= 'a' && ch[i] <= 'z')
{ 
 
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 32); 
                } 
            } 
 
            // If apart from first character 
            // Any one is in Upper-case 
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
 
                // Convert into Lower-Case 
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
 
        // Convert the char array to equivalent String 
        String st = new String(ch); 
        return st; 
}
 
 
public static void main(String[] args) {
 
 
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter the array:");
str=s.nextLine();
Ques3  obj=new Ques3 ();
 
System.out.println(obj.LetterCapitalize(str));
 
 
}
 
 
}

