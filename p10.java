//Next permutation
import java.io.*;
public class p10 {

    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        int a;int i,j;
    System.out.println("Enter a number");
    a=Integer.parseInt(in.readLine());
    int c=0;
       for(int t=a;t!=0;t=t/10,c=c+1);
       System.out.println("No of digits is "+c);
        int arr[]=new int[c];
        String s=Integer.toString(a);
        for( i=0;i<c;i++)
        {
            arr[i]=s.charAt(i)-'0';
        }
        System.out.println("number is ");
        for( i=0;i<c;System.out.print(arr[i]),i++);
        int p=-1;
        for(i=c-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                p=i-1;
                break;
            }
        }
        if(p==-1)
        {
            for(i=1;i<c;i++)
            {
                int k=arr[i];
                for(j=i-1;j>=0 && arr[j]>k;j=j-1)
                {
                    arr[j+1]=arr[j];
                }
                arr[j+1]=k;
            }
        }
        else
        {
            for(i=c-1;i>=0;i--)
            {
                if(arr[i]>arr[p])
                {
                   int temp=arr[i];
                   arr[i]=arr[p];
                   arr[p]=temp;
                    break;
                }
            }
            for(i=p+1;i<c;i++)
            {
                for(j=p+1;j<c-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int t= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                }
            }
        }

        
    }
    System.out.println("Next permutation is");
    for(i=0;i<c;System.out.print(arr[i]),i++);
}
}
