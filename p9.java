
import java.io.*;
public class p9 {


   static String swap(String s,int p,int m)
    {
        char str[]=s.toCharArray();
        char temp=str[p];
        str[p]=str[m];
        str[m]=temp;
        return String.valueOf(str);
    }
 static void permute(String s,int l,int r)
{
    int i;
    if(l==r)
    {
        System.out.println(s);
        return;
    }
    
    for(i=l;i<=r;i++)
    {
        s=swap(s,l,i);
        permute(s,l+1,r);
        s=swap(s,l,i);
    }
}


    public static void main(String args[])throws IOException
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new  BufferedReader(read);
    System.out.println("Enter a String");
    String str=in.readLine();
    int t=str.length();
    t=t-1;
    permute(str,0,t);


}
        
    
}
