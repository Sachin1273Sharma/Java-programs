import java.util.Scanner;
public class p22
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n;
    System.out.println("Enter a year");
    n=in.nextInt();
    if((n%4==0 && n%100!=0) ||n%400==0)
    {
        System.out.println("It is a leap year");
    }
    else
    {
        System.out.println("It is not a leap year");
    }
    in.close();
  }  
}
