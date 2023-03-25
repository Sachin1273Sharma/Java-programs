//print numbers for 1 to n using recursion
import java.util.*;
public class p23 {
    public static void printnum(int x,int n)
    {
        if(x==n)
        {
            System.out.print(x);
            return;
        }
        else
        {
            System.out.print(x+"   ");
            printnum(x+1,n);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        printnum(1,n);
        in.close();
    }
}
