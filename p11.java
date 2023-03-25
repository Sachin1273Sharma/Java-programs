/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0 */
import java.io.*;

public class p11 {
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter no of days");
        int n=Integer.parseInt(in.readLine());
        System.out.println("input prices for "+n +"days");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
        int max=0;int j;int mp=0;
        for(i=0;i<n;i++)
        {
            int t=arr[i];

            for(j=i+1;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
          
            if(max<t)
            {

            }
            else
            {
                int x=max-t;
                if(x>mp)
                mp=x;
            }
            max=0;
        }
        System.out.println("Max profit is"+mp);
        


    }

    
}
