import java.io.*;
public class p19 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number");
         int n=Integer.parseInt(in.readLine());
         int i,j,k;
         int t=2*n-1;
         for(i=1;i<=n;i++)
         {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=t;k++)
            {
                if(k==1||k==t||i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            t=t-2;
            System.out.println();
         }

    }
}
