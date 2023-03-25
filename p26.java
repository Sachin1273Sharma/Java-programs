// decimal to binary 
import java.io.*;
public class p26 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n;

        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());
        int t;
        t=n;int i=1;int p=0;
        while(t>0)
        {
          int   r=t%2;
            p=p+i*r;
            i=i*10;
            t=t/2;
        }
        System.out.println("Binary number is "+p);
        
    }
}
