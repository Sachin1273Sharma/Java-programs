import java.util.*;
public class p40 {
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    Vector <String> a=new Vector <>();
    String x;
    for (int i=0;i<10;i++)
    {
        System.out.println("Enter  String "+i+1);
        x=in.next();
        a.addElement(x);
        x="";
    }
    System.out.println("Vector is "+a);
    in.close();


}
}
