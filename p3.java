//Kadane Algorithm
import java.util.*;
public class p3 {
    public static void main(String args[])
    {
        try(Scanner in=new Scanner(System.in))
        {
            int n;
            System.out.println("Enter number of elements to be entered by user");
            n=in.nextInt();
            
            int a[]=new int[n];
            System.out.println("Enter "+n+"Elements in an array");
            
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int max=a[0];int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+a[i];
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<0)
                {
                    sum=0;
                }
            }
            System.out.println("Sum of Maximum element in an subarray is"+max);
        

        }
    }
}
