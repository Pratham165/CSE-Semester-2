import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int temp,n=0,remainder;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check:");
        int orgn = sc.nextInt();
        
        temp=orgn;
        while (temp>0) {
            remainder = temp%10;
            n = n*10+remainder;
            temp = temp/10;
            
        }
        if (n==orgn) {
            System.out.println("The num is palindrome");
            
        }
        else{
            System.out.println("The num is not a palindrome");
        }
    }
    
}
