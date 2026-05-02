import java.util.Arrays;
import java.util.Random;
class random {
    public static void main(String args[])
    {
      Random rm = new Random();
      int n=  rm.nextInt(6);
      System.out.println(n);
      boolean b=rm.nextBoolean();
      System.out.println(b);
      double g = rm.nextGaussian();
      System.out.println(g);
      long l = rm.nextLong();
      System.out.println(l);
      float f = rm.nextFloat();
      System.out.println(f);
      double g1 = 10+(2*rm.nextGaussian());
      System.out.println(g);
      byte bt[] = new byte[10];
      System.out.println(Arrays.toString(bt));
      rm.nextBytes(bt);
      System.out.println(Arrays.toString(bt));
      
    }
    }
