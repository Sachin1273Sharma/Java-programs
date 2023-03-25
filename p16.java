/*
 

. Sandglass Star Pattern
Enter the number of rows: 5
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 


 */
import java.util.*;
public class p16 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter a number");
       int n=in.nextInt();
       int x=n;
      
       for(i=1;i<=2*n;i++)
       {
        if(i<=n)
        {
        for(j=1;j<i;j++)
        {
            System.out.print(" ");
        }
        for(k=n;k>=i;k--)
        {
            System.out.print("* ");
        }
       }
       else
       {
        for(int m=1;m<x;m++)
        {
            System.out.print(" ");
        }
        for(int l=n+1;l<=i;l++)
        {
            System.out.print("* ");
        }
        x--;
    }
        System.out.println();
       }
    




    }
}
