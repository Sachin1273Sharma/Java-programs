//generate 5 palindrome strings

import java.util.*;

public class p34 {
    public static String  generate(int n) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = n;
        Random random = new Random();
    
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
    
       return generatedString;
    }
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
 static int c=0;
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       System.out.println("Enter the length of the string ");   
      int l=in.nextInt();

            for(int i=1;i>=0;i++)
        {
            String x=generate(l);
            boolean p=ispalin(x,0,x.length()-1);
            
            if(p==true)
            {
                System.out.println(x);
                c=c+1;
            }
            if(c==5)
            {
                break;
            }

        }
        in.close();
    }
}
