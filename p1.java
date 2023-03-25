//maximum and minimum element in an array
import java.util.*;
class p1
{
public static void main(String[] args)
{
 try (Scanner in = new Scanner(System.in)) {
   int a[]=new int[10];
    System.out.println("Enter an array");
    int i;
    for(i=0;i<10;i++)
    {
       System.out.println("Enter value at index"+i);
       a[i]=in.nextInt();
    }
    for(i=0;i<10;i++)
    {
       System.out.print(a[i]+" ");
    }
    System.out.println();
   int max=a[0],min=a[0];
    for(i=1;i<10;i++)
    {
      if(a[i]>max)
      {
         max=a[i];
      }
      if(a[i]<min)
      {
         min=a[i];
      }
    }
    System.out.println("Maximum element in an array is"+max+"And minimum element in an array is "+min);
    

}
}
}
