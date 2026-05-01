import java.util.*;
public class exp {
    public static void main(String args[])
    {expt obj=new expt();
          obj.etrack();
    }}
class expt
{
    void etrack()
    {
        int total=0;
        while(true){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the expense name: ");
        String a = s.nextLine();
        System.out.println("Enter the expense price: ");
        int b= s.nextInt();
        System.out.println("continue the loop : ");
        int c=s.nextInt();
        total+=b;
      if(c==0){
        break;
        }}
    System.out.println("total expense : "+total);
}}





