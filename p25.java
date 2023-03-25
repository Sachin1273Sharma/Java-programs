//print factorial using recursion

import java.util.Scanner;
public class p25 {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        
        int t=factorial(n-1);

        System.out.print(n+"*");
        return n*t;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.print("="+factorial(n));
        in.close();
    }
}


