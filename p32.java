//check if array is sorted
import java.util.*;
public class p32 {
    public static boolean checksort(int i,int a[])
    {
        if(i==9)
        {
            return true;
        }
        else if(a[i]>a[i+1])
        {
            return false;
        }
        return checksort(i+1,a);
    }
    public static void main(String args[])
    {
       try( Scanner in=new Scanner(System.in))
       {
        System.out.println("Enter array of 10 elements");
        int []a=new int[10];
        for (int i=0;i<10;i++)

        {
            System.out.println("Enter "+i+" index element");
            a[i]=in.nextInt();
        }
        boolean x=checksort(0,a);
        if(x==true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
       }
    }
}
