/* missing and repeated array */
import java.io.*;
public class p18 {
    public static void main(String args[])throws IOException
    {
   InputStreamReader read=new InputStreamReader(System.in);
   BufferedReader in=new BufferedReader(read);
   int n;
   System.out.println("Enter n so that we can input from 1 to n");
   n=Integer.parseInt(in.readLine());
   int a[]=new int[n];int i;
   for(i=0;i<n;i++)
   {
    System.out.println("Enter "+i +"Index Element");
    a[i]=Integer.parseInt(in.readLine());
   }
   int b[]=new int[n+1];
   for(i=0;i<=n;i++)
   {
    b[i]=0;
   }
   for(i=0;i<n;i++)
   {
  int  t=a[i];
    b[t]=b[t]+1;
   }
   for(i=1;i<=n;i++)
   {
    if(b[i]==0)
    {
        System.out.println("missing number is "+i);
    }
    if(b[i]>1)
    {
        System.out.println("Repeating number is"+i);
    }
   }


    }
}
