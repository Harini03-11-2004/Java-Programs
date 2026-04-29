import java.util.*;
public class pn {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=0)
        {
            System.out.println("positive number");
        }
        else if(n<=0)
        {
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}
