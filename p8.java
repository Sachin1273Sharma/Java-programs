
/*powerset of a Strings */
import java.io.*;
public class p8 {

    static void powerset(String s,int i,String cur)
    {
        if(i==s.length())
        {
        System.out.println(cur);
        return ;
        }
        powerset(s,i+1,cur+s.charAt(i));
        powerset(s,i+1,cur);
        
    }

     public static void main(String args[])throws IOException
     {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String");
        String s=in.readLine();
        powerset(s,0,"");


     }
}
