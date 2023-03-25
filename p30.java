//Tower of hanoi
import java.util.*;
public class p30 {
    public static void tower(int n,char A ,char B,char C)
    {
        if(n==1)
        {
            System.out.println("Disk "+n +" From "+" Source "+ A +" Des "+C);
            return;
        }
        tower(n-1,A,C,B);
        System.out.println("Disk "+n +" From "+" Source "+ A +" Des "+C);
        tower(n-1,B,A,C);
    }
    public static void main(String args[])
    {
        try(Scanner in=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter n");
            n=in.nextInt();
            char a='a',b='b',c='c';
            tower(n,a,b,c);
            
        }
    }

}
