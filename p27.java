//binary to decimal
import java.util.*;
public class p27
{

    static int f=1;
    public static int power(int a ,int b)
    {
        if(b==0)
        {
            return f;
        }
        else
        {
        f=f*a;
      return( power(a,b-1));
        
    }
}
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=in.nextInt();
    int s=0;
    int p=0;
    System.out.println("5^5="+power(5,5));
    int t=n;
    while(t>0)
    {
      int  r=t%10;
        s=s+r*power(2,p);
        t=t/10;
        p=p+1;
        f=1;
    }
    System.out.println("Decimal Number is "+s);
    in.close();

    
}
}

