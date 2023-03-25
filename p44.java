//find no of ways in which you can invite n people to your party, single or in pairs
import java.util.*;
public class p44 {
   public  int party(int n)
    {
        if(n==2)
        {
            return 2;
        }
        if(n==1)
        {
            return 1;
        }
        int pair=(n-1)*party(n-2);
        int single=party(n-1);
        return pair +single;
    }
    public static void main(String args[])
    {
        p44 ob=new p44();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int x=ob.party(n);
        System.out.println("no of ways in which n people can be invited to party in pair or in single is "+x);

in.close();
    }
}
