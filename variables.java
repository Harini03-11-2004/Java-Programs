public class variables {
    public static void main(String args[])
    {
        samp obj =new samp();
        obj.add();
        System.out.println(obj.a);
        System.out.println(samp.b);
        obj.a=200;
        System.out.println(obj.a);
        obj.b=500;
        System.out.println(obj.b);
    }
}
    class samp
    {
        int a=30;
        static int b= 10;
        void add()
        {
            int a=50;
            final int c=20;
            System.out.println(a);
            System.out.println(c);
        }
    }

