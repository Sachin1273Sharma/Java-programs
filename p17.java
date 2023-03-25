/*13. Triangle Star pattern
Enter the number of rows: 5

    *
   * *
  *   *
 *     *
*********
 */
import java.util.*;
public class p17 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,k;int x=1;
      System.out.println("Enter no of rows");
    int n=in.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=n-1;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(k=1;k<=x;k++)
        {
           if(k==1||k==x||i==n)
           {
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
        x=x+2;
    }
    }
}

