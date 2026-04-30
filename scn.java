import java.util.*;
public class scn {
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = s1.nextLine();
        System.out.println("Enter the age: ");
        int age = s1.nextInt();
        System.out.println("Enter the no : ");
        long no =  s1.nextLong();
        System.out.println("Enter the email  ");
        String email = s1.next();
        System.out.println("Enter the salary: ");
        float salary = s1.nextFloat();
        System.out.println("Enter the height: ");
        double height =  s1.nextDouble();
        System.out.println("Enetr the weight : ");
        double weight = s1.nextDouble();
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("no: "+no);
        System.out.println("email: "+email);
        System.out.println("salary: "+salary);
        System.out.println("height: "+height);
        System.out.println("weight: "+weight);

    
    }
}
