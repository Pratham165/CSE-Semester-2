import java.util.Scanner;
public class Palindrome2 {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        String a = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            a=a+s.charAt(i);
        }
        if (s.equals(a)) {
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
    }
}
