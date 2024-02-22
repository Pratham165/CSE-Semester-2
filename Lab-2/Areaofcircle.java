import java.util.Scanner;
public class Areaofcircle {
public static void main(String[] args) {
    Scanner cs = new Scanner(System.in);
    System.out.print("Enter radius of the cirlce:");
    double r = cs.nextDouble();
    double area = Math.PI*r*r;
    System.out.println("The area of circle="+area);
}
    
}