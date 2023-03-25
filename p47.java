// Merge sort
import java.util.*;
public class p47 {
   

     
   
    public static void mergesort(ArrayList<Integer> a,int lb,int ub,int b[])
    {int mid;
        if(lb<ub)
        {
             mid=(lb+ub)/2;
             mergesort(a,lb,mid,b);
             mergesort(a,mid+1,ub,b);
             merge(a,lb,mid,ub,b);
        }
    }
    public static void  merge(ArrayList<Integer> a,int lb,int mid ,int ub,int b[])
    {
        int i=lb;
        try{
       int j=mid+1;
       int k=lb;
      
       while(i<=mid && j <=ub)
       {
        if(a.get(i)<=a.get(j))
        {
            b[k]=a.get(i);
            i++;k++;
        }
        else
        {
            b[k]=a.get(j);
           
            j++;k++;
        }
       }
       if(i>mid)
       {
        while(j<=ub)
        {
           b[k]=a.get(j);
           i++;k++;
        }
       }
       else
       {
        while(i<=mid)
        {
          b[k]=a.get(i);
          i++;k++;
        }
       }
    }
    catch(Exception e)
{
    System.out.println("There is an Exception  ::::: "+e);
}
    }

    public static void main(String args[])
    {
        Random rand = new Random();
    
    int b[]=new int[10];
    ArrayList<Integer> a=new ArrayList<Integer>();    
    ArrayList<String> s=new ArrayList<String>()
    {
    {
        add("st");
        add("nd");
        add("rd");
    }
};
    System.out.println("Enter an array of 10 elements ");
    int i;
   
    for(i=0;i<10;i++)
    {
        if(i<=2)
        System.out.println("Enter "+(i+1)+s.get(i)+"Element");
        else
        System.out.println("Enter "+(i+1)+"th element");
        int n=rand.nextInt(100);
        System.out.println(n);
        a.add(n);
    }
    System.out.println("Array before Sorting");
    for(i=0;i<10;i++)
    {
        System.out.print(a.get(i)+"  ");
    }
    int lb=0;
    int ub=9;
    mergesort(a,lb,ub,b);
    System.out.println("Array after sorting");
    a.clear();
    for(i=lb;i<=ub;i++)
    {
        a.add(b[i]);
    }
    for(i=0;i<=9;i++)
    {
        System.out.print(a.get(i)+"\t\b\b");
    }
  

  
    
}

}
