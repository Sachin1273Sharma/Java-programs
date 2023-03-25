//insertion sort
import java.util.*;
public class p46 {
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> a=new ArrayList<Integer>();
            System.out.println("Enter 10 elements in an array");
            int i;
            String s[]={"st","nd","rd"};
            for(i=0;i<10;i++)
            {
                if(i<=2)
                {
                System.out.println("Enter "+(i+1)+s[i]+" index element");
                }
                else{
                System.out.println("Enter "+(i+1)+"th index elemetn"); 
                }
                int  n=in.nextInt();
                a.add(n);
            }
            System.out.println("Array before sorting ");
            for(i=0;i<10;System.out.print(a.get(i)+","),i=i+1);
            int j;
            System.out.println();
            for(i=1;i<10;i++)
            {
                int key=a.get(i);
                for(j=i-1;j>=0 && a.get(j)>key;j=j-1)
                {
                    a.remove(j+1);
                    a.add(j+1,a.get(j));
                }
                a.remove(j+1);
                a.add(j+1,key);
            }
            System.out.println("ArrayList after sorting");
            for(i=0;i<=9;i++)
            {
                System.out.print(a.get(i)+",");
            }
            System.out.println(a.get(i));
            in.close();
        }

    }
    
}
