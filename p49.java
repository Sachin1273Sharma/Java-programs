//quick sort
import java.util.*;


public class p49 {
    static int arr[]=new int[20];
    
    public  void swap(int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
 private void quicksort(int lb,int ub)
    {
        try{
      
        int i=lb;
        int j=ub;
        int pivot=arr[lb+(ub-lb)/2];
        while(i<=j)
        {
            while(arr[i]<=pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                swap(i,j);
                i++;
                j--;

            }
        }
        
        if(lb<j)
        {
            quicksort(lb,j);
        }
         if(i<ub)
        {
           quicksort(i,ub);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
        
      
       
    }
     public static void main(String args[])
    {
        p49 ob=new p49();
        Random r=new Random();
        System.out.println("Enter an array of 20 elements");
        ArrayList<String> s=new ArrayList<String>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        s.add("st");
        s.add("nd");
        s.add("rd");
        for(int i=0;i<20;i++)
        {
            if(i<=2)
            {
                System.out.println("Enter"+(i+1)+s.get(i)+" element");

            }
           
            else
            {
                System.out.println("Enter"+(i+1)+"th element");
            }
            int n=r.nextInt(100);
            System.out.println(n);
            a.add(n);
        }
        System.out.println("Array before sorting");
        for(int i=0;i<20;i++)
        {
            System.out.print(a.get(i)+"\t\b");
        }
       
        for(int i=0;i<20;i++)
        {
            arr[i]=a.get(i);
        }
        a.clear();
        ob.quicksort(0,19);
        System.out.println("\n Array after sorting");
        for(int i=0;i<20;i++)
        {
            System.out.print(arr[i]+"\t\b\b\b");
        }
    }
}
