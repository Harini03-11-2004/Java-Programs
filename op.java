public class op {
    public static void main(String[] args) {
        int a = 5;
        int b=10;
        boolean c= true;
        boolean d=false;
        //arthimatic//
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
       //relational//
        System.out.println(a>b);
         System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
         System.out.println(a!=b);
         System.out.println(!c);
         System.out.println(!d);
         //logical//
         System.out.println(c&&d);
        System.out.println(c||d);
        System.out.println(!(a>b));
        System.out.println(5+10+"a");
        System.out.println("a"+5+"b");
        //bitwise//
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a); 
        System.out.println(a>>b);
        System.out.println(a<<b);
        //ternary//
        int max = (a > b) ? a : b;
        System.out.println(max);
        
        //Increment &decrement//
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a--);
        int g=5;
        System.out.println(g++ + ++g + --g);
    }
}

