//decimal to octal
import java.util.*;
public class p28 {
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter an Decimal number");
            int n=in.nextInt();
            String s=Integer.toString(n);
      char p[]=s.toCharArray();
      
      int i;
      for(i=0;i<p.length;i++)
      {
            System.out.println(p[i]);
      }
      for(i=0;i<s.length();i++)
      {
            if(Character.isDigit(p[i]))
            {
                
            }
            else
            {
                System.out.println("Not a decimal number");
                System.exit(0);
            }
      }
      int t=n,j=1,x=0;
      while(t>0)
      {
            int r=t%8;
            x=x+j*r;
            j=j*10;
            t=t/8;
      }
      System.out.println("Octal number is"+x);
      in.close();
        }
    }
}
