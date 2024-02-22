import java.util.Scanner;
public class Length{
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter String elements:");
        String a = cs.next();
        System.out.println("The length of string is:"+a.length());
        for(int i=(a.length())/2; i<a.length(); i++){
            
            System.out.print(a.charAt(i));
        }

    }
}