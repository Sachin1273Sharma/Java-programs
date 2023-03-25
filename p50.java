//merge sort
import java.util.*;


public class p50
{
  static  int n;
   static  int b[];
    void mergesort(int a[],int lb,int ub)
    {
try {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            mergesort(a,lb,mid);
            mergesort(a,mid+1,ub);
            merge(a,lb,mid,ub);

        }
    }
    catch(Exception e)
    {
        System.out.println(e);
        System.exit(0);
    }
}

    void merge(int a[],int lb,int mid ,int ub)
    {
        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid && j<=ub)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
                k++;
                
            }
            else
            {
                b[k]=a[j];
                j++;
                k++;
                
            }
        }
        if(i<mid)
        {
            while(i<=mid)
            {
                b[k]=a[i];
                k++;i++;
            }
        }
        else
        {
                while(j<=ub)
                {
                    b[k]=a[j];
                    k++;j++;
                    
                }
        }
    }
public static void main(String args[])
{
    Random rand=new Random();
p50 ob=new p50();

try (Scanner in = new Scanner(System.in)) {
    System.out.println("Enter number of elements to be entered by the user");
     n=in.nextInt();
   int   b[]=new int[n];

ArrayList<Integer> a=new ArrayList<Integer>();
ArrayList<String> s=new ArrayList<String>()
{
    {
        add("st");
        add("nd");
        add("rd");
    }
};
System.out.println("Enter "+n+" Elements in the list");
for(int i=0;i<n;i++)
{
    if(i<=2)
    {
    System.out.println("Enter "+(i+1)+s.get(i)+" element");
}
else
{
    System.out.println("Enter "+(i+1)+"th element");
}
int x=rand.nextInt(100);
System.out.println(x);
a.add(x);
}
System.out.println("Array before sorting");
for(int i=0;i<n;System.out.print(a.get(i)+"\t\b\b\b"),++i);
System.out.println("Array after sorting");
int arr[]=new int[n];
for(int i=0;i<n;arr[i]=a.get(i),i++);
ob.mergesort(arr,0,n-1);
for(int i=0;i<n;System.out.print(b[i]+"\t"),i++);

}
}

}
