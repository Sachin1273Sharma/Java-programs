import java.io.*;
public class p21 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n;int coef=1;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        int i;
        for(i=0;i<n;i++)
        {
            int j;
            for(j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                if(k==0||i==0)
                {
                   coef=1; 
                }
                else
                {
                    coef=coef*(i-k+1)/k;
                }
                System.out.print(coef + " ");
            }
            System.out.println();
    }
}
}
