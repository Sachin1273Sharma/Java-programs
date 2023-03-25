//First and last occurence of character in string using recursion
import java.util.*;
public class p31 
{
    static int k=0,p,x=0;
    public static void fl(int i,String s,char ch)
    {
        if(i==s.length())
        {
            if(x==1)
            {
                System.out.println(" Last occurence :Element present at index "+(p+1));
            }
            else
            {
                System.out.println("Element not present in String");
            }
         
            return;
        }
        if(s.charAt(i)==ch)
        {
            if(k==0)
            {
                System.out.println("first occurence is at index "+ (i+1));
                k++;
            }
            else
            {
                x=1;
            p=i;
            }
        }
        fl(i+1,s,ch);
    }
    public static void main(String args[])
    {
        try(Scanner in=new Scanner(System.in))
        {
            System.out.println("Enter the string");
            String s=in.nextLine();
            System.out.println("Enter the Character");
            char ch=in.next().charAt(0);
            fl(0,s,ch);
        }
    }
}
