 import java.util.*;
 class patientId {
    public static void main(String args[])
    {
         int[] pid={1,10,20,25,30};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the patient ID: ");
        int n = s.nextInt();
        boolean found =false;
        for(int i=0;i<pid.length;i++)
        {
            if(pid[i]==n)
            {
                found=true;
            }
        }
        if(found)
        {
            System.out.println("patient ID found ");
        }
        else
        {
            System.out.println("patient id not found");
        }}}

    

