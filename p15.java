/*left triange pascal
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *



 */
import java.util.Scanner;
public class p15 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,k;int p=1,x=1;
        int n;
        System.out.println("Enter n");
        n=in.nextInt();
       int t=n;
        for(i=1;i<2*n;i++)
        {
            if(i<=n)
            {
            for(j=1;j<t;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");

            }
            t--;
        }
        else{
            
            for(int m=1;m<=x;m++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=n-p;l++)
            {
                System.out.print("*");
            }
            p++;
            x++;

        }
        System.out.println();

        }
        
    }

}
