import java.util.*;
public class largest {
    public static void main(String args[])
    {Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
       if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Equal");
        }


    }
}
