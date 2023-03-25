/*. Downward Triangle Star Pattern
Enter the number of rows: 5

* * * * * 
* * * * 
* * * 
* * 
* 
       */

public class p13 {
    public static void main(String args[])
    {
    int i,j;
    for(i=5;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}