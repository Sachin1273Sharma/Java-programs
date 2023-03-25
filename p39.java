
//print all permutation of the string
import java.util.*;
public class p39 {
    public static String swap(String s,int p,int m)
    {
        char st[]=s.toCharArray();
        char temp=st[p];
        st[p]=st[m];
        st[m]=temp;
        return String.valueOf(st);
    }
    public  static synchronized void permute(String s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
            return;
        }
        for (int i=l;i<=r;i++)
        {
            s=swap(s,l,i);
            permute(s, l+1, r);
            s=swap(s,l,i);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string \n");
        String str=in.next();
       int  t=str.length();
        permute(str,0,t-1);
        in.close();


    }
}
