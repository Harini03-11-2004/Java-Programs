import java.util.*;
public class mf {
    public static void main( String args[])
    {
       todol x = new todol();
       x.todo();
    }
}
class todol
{
    void todo()
    {
        System.out.println("Enter the task: ");
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        if(b.isEmpty())
        {
            System.out.println("Task not entered");
            return;
        }
        else
        System.out.println("your task: "+b);
        System.out.println("thankyou for adding the task");
    }
}
