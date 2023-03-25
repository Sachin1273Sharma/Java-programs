import java.io.*;


public class p20 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int t=2*n-1;int p=n;int t1=1;
        for(int i=1;i<=2*n;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=t;k>=1;k--)
                {
                    if(i==1||k==1||k==t)
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
                else
                {
                    
                    for(int l=p;l>1;l--)
                    {
                        System.out.print(" ");
                    }
                    for(int m=1;m<=t1;m++)
                    {
                        if(i==2*n||m==1||m==t1)
                        System.out.print("*");
                    
                    else
                    {
                        System.out.print(" ");
                    }
                }
                  t1=t1+2;
                  p=p-1;
                
                System.out.println();
            }
        }
    }
}

