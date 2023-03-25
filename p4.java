
/*Contains duplicates */
import java.util.*;
public class p4 {
    public static void main(String args[])
    {
       try( Scanner in=new Scanner(System.in))
       {
        int a[]=new int[10];int i,j,c=0;
        System.out.println("Enter 10 elements in an array");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<9;j++)
            {
                if(a[i]==a[j+1])
                {
                    c=1;break;
                }
            }
            if(c==1)
            {
                break;
            }
        }
        if(c==1)
        {
            System.out.println("duplicates found");
        }
        else
        {
            System.out.println("Duplicates not found");
        }
       }
    }
    
}
