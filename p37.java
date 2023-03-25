//count total path in a maze to move from (0,0) to (n,m)




public class p37{
    public static int count(int i, int j,int n, int m)
    {
        if(i==n || j==m)
        {
            return 0;
        
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        
        //mov down 
       int down=count(i+1,j,n,m);
       int right=count(i,j+1,n,m);
       return down+right;
    }
    public static void main(String args[])
    {
        

             int n=4;
           
             int m=4;
             int x=count(0,0,n-1,m-1);
             System.out.println("total count path is "+x);
    }
    
}
