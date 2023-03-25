// total no of ways by which   tile of size 1xm  can be placed in a floor of size n*m;
import java.util.*;
public class p43 {
    public static int placetiles(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        int ver=placetiles(n-m,m);
        int hor=placetiles(n-1,m);
        return ver+hor;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int  n=in.nextInt();
        System.out.println("Enter m");  
        int m=in.nextInt();
        int x=placetiles(n,m);
        System.out.println("Total ways in which tiles can be placed \t"+x);
        in.close();
    }
}
