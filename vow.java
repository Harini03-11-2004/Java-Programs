import java.util.*;;

class vow
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
         char ch = s.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}