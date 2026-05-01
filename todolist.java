import java.util.*;
 class todolist {
    public static void main(String args[])
    {

        todol x = new todol();
        x.todo(); 
    }
}
class todol
{
    void todo()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the task1: ");
        String task1 =  s.nextLine();
        System.out.println("Enter the task 2: ");
        String task2 = s.nextLine();
        System.out.println("Enter the task 3: ");
        String task3=s.nextLine();
        System.out.println("task1: "+task1);
        System.out.println("task2: "+task2);
        System.out.println("task3: "+task3);
    }
}
