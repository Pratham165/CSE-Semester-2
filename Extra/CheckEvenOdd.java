
package Extra;
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

    }
}