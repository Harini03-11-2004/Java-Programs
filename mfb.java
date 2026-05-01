import java.util.*;
public class mfb {
    public static void main(String args[])
    {
       todolist y=new todolist();
       y.todo();
    }
}
class todolist
{
    void todo()
    {
        System.out.println("Enter the task: ");
        Scanner s=new Scanner(System.in);
        String i = s.nextLine();
        if(i.isBlank())
        {
System.out.println("Task not entered: ");
return;
        }
        else
            System.out.println("your task: "+i);
        System.out.println("Thankyou for entering the task");

        
    }
}
