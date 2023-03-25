//remove all duplicates in the string 
import java.io.*;
public class p36 {
    public static String removeduplicate(String s,int i,String n)
    {
        if(i==s.length())
        {
            return n;
        }
        else 
        {
            int p=0;
            for(int j=0;j<n.length();j++)
            {
                if(s.charAt(i)==n.charAt(j))
                {
                    p=1;
                }

            }
            if(p==0)
            {
                n=n+s.charAt(i);
            }

        }
      return   removeduplicate(s, i+1, n);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a String");
        String str=in.readLine();
        String x=removeduplicate(str,0,"");
        System.out.println("string after removing duplicates   "+x);
        in.close();
    }
    
}
