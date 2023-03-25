//print all subsequence 
import java.util.*;
public class p35 {
    public static void subsequence(String s,int i,String cur)
    {
        if(i==s.length())
        {
            System.out.println(cur);
            return;
        }
        else
        {
            subsequence(s, i+1, cur+s.charAt(i));
            subsequence(s,i+1,cur);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=in.next();
        subsequence(s,0,"");
        in.close();

    }
}
