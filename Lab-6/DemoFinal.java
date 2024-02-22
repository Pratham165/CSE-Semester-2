import java.util.Scanner;
static final int area() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of rectangle:");
     int x = sc.nextInt();
     System.out.println("Enter the breadth of rectangle:");
     int y = sc.nextInt();
     return (x * y);

}


public class DemoFinal {
    public static void main(String[] args) {
        System.out.println("Area:"+area());
        
    }
    
}
