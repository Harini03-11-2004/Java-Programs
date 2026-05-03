import java.util.*;
public class math {
    public static void main(String args[])
    {
        //Absolute
         int n=80;
         System.out.println(Math.abs(n));
         //round
         float a = 5.8f;
        System.out.println(Math.round(a));
        //square
        int b = 25;
        System.out.println(Math.sqrt(b));
        //ceil
        double num1=1.2;
        double num2 = 8.5;
        System.out.println("num1: "+Math.ceil(num1));
        System.out.println("num2: "+Math.ceil(num2));
        //floor
        double c= 1.5;
        double d= 2.8;
        System.out.println("num1: "+Math.floor(c));
        System.out.println("num2: "+Math.floor(d));
        //min
        int e = 25;
        int f=30;
        System.out.println("Minimum: "+Math.min(e,f));
        //tan
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the angle : ");
        double degree=s.nextDouble();
        double randians=Math.toRadians(degree);
        double tanValue=Math.tan(randians);
        System.out.println(tanValue);
        //Max
        int x = 25;
        int y=30;
        System.out.println("Minimum: "+Math.max(e,f));
        //cos
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle : ");
        double deg=s.nextDouble();
        double rand=Math.toRadians(deg);
        double cosValue=Math.cos(rand);
        System.out.println(cosValue);
        //sin
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the angle : ");
        double de=i.nextDouble();
        double r=Math.toRadians(de);
        double sinValue=Math.cos(randians);
        System.out.println(sinValue);
      }
}
