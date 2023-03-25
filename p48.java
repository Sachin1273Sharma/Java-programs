//counting sort
import java.util.*;
public class p48 
{
    public static void main(String args[])
    {
        
        Random rand=new Random();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<String> s=new ArrayList<String>()
        {
        {
            add("st");
            add("nd");
            add("rd");
        }
        };
        System.out.println("Enter an array of 10 elements");
        for(int i=0;i<10;i++)
        {
            if(i<=2)
            {
                System.out.println("Enter "+(i+1)+s.get(i)+" element");
                
            }
            else
            {
                System.out.println("Enter "+(i+1)+" element");
            }
            int n=rand.nextInt(50);
            a.add(n);
            System.out.println(n);
        }
        int b[]=new int[10];
        int max=0;
        for(int i=0;i<10;i++)
        {
            if(a.get(i)>max)
            {
                max=a.get(i);
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<10;i++)
        {
            ++count[a.get(i)];
        }
        for(int i=1;i<=max;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=9;i>=0;i--)
        {
           
            b[--count[a.get(i)]]=a.get(i);
        }
        System.out.println("Array after sortin");
        for(int i=0;i<10;i++)
    {
        System.out.print(b[i]+"\t\b\b");
    }

       
    }
}
