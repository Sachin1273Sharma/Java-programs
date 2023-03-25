//Chocklate distribution problem 
//given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.


import java.util.*;
 class p5 
{
    public static void main(String args[])
    {
        try(Scanner in=new Scanner(System.in))
        {
            int m,n;int j,i,u=0,z=0;
            System.out.println("Enter number of students");
            m=in.nextInt();
            System.out.println("Enter number of choclates boxes");
            n=in.nextInt();
            int a[]=new int[n];
         
            System.out.println("Enter number of choclates to be put in"+" "+n+"Boxes");
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            for(i=1;i<n;i++)
            {
                int k=a[i];
                for(j=i-1;j>=0&&a[j]>k;j--)
                {
                    a[j+1]=a[j];
                }
                a[j+1]=k;
            
            }
            System.out.println("Sorted array");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+",");
            }
       
            int min=Integer.MAX_VALUE;
            for(i=0;i+m-1<n;i++)
            {
                    int t=a[i+m-1]-a[i];
                    if(t<min)
                    {
                        min=t;
                        u=i+m-1;
                        z=i;
                    }
                    

                
            }

            for(i=u;i<=z;i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.println();
            System.out.println("Minimum difference is "+min);






        }
    }
}
