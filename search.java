import java.util.*;
public class search {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
         int[] arr={10,20,30,40,50};
         System.out.println("Enter the search element: ");
         int a=s.nextInt();
         boolean found=false;
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==a)
            {
                 found=true;
                 break;
            }
         }
         if(found)
         {
            System.out.println("element found");
         }
         else
         {
            System.out.println("element not found");
         }
        }
    }

    
        