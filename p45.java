import java.util.*;
public class p45 {
    public static void printsubset(ArrayList<Integer> s)
    {
        int i;
        for(i=0;i<s.size();i++)
        {
          System.out.print(s.get(i)+" ");
        }
        System.out.println();
    }
    public static void  subsets(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printsubset(subset);
            return;
        }
        subset.add(n);
        subsets(n-1,subset);
        subset.remove(subset.size()-1);
        subsets(n-1,subset);

    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=in.nextInt();
    ArrayList<Integer> subset=new ArrayList<>();
    subsets(n,subset);
    in.close();
    
    
    }

}
