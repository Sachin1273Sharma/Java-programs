//search an elemtent in an sorted and rotated array;

import java.io.*;
public class p6 {


    static int search(int a[],int key)

    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
         int  mid=(low+high)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            if(a[low]<=a[mid])
            {
                if(key>=a[low] && key<a[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
                
                
            }
            else
            {
                if(key>a[mid] && key<=a[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
       
            return -1;
    }
    public static void main(String args[])throws IOException
    {
      
       int x[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
       int y[]={30, 40, 50, 10, 20};
       int m=search(x,3);
       int n=search(y,10);
       System.out.println("Array x element 3  index is at "+m);
        System.out.println("Array y element 10 index is at"+n);
    
}
}
