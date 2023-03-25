//print sum of first n natural numbers using recursion
import java.util.*;
public class p24 {
    static int s=0;
    public static void sum(int n,int t)
    {
        
        if(n==0)
        {

            return;
        }
        else
        {
            s=s+n;
            sum(n-1,n);
            System.out.print(n+" +");
            if(n==t)
            {
                System.out.print("="+s);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter n");
        n=in.nextInt();
        sum(n,n);
        in.close();
    }

}
