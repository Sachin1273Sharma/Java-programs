//check palindorme string using recursion


import java.io.*;
public class p7 {
    static boolean ispalin(String s,int l,int r)
    {
        if(l>=r)
        {
            return true;
        }
        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
        return ispalin(s,l+1,r-1);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a string ");
        String s=in.readLine();
        System.out.println("Palindorme String "+ispalin(s,0,s.length()-1));
        
    }
}
