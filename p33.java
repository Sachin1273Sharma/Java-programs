//move all  user given character  to the end of the string using recursion
import java.util.*;
public class p33 {
    static int c=0,k=0;
    public static String move(int i,String s,char ch,String str)
    {
        if(i==s.length())
        {
            for (int j=1;j<=c;j++)
            {
                str=str+ch;
            }
            return str;
        }
        else if(ch==s.charAt(i))
        {
            c=c+1;
        }
        else
        {
            str=str+s.charAt(i);
        }
       return move(i+1,s,ch,str);
       
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
            System.out.println("Enter a character to be moved to end");
            char ch=in.next().charAt(0);
            System.out.println("Enter the string");
            String s=in.next();
            String x=move(0,s,ch,"");
            System.out.println("String is "+x);
            in.close();

        
    }
}
