import java.util.Scanner;
 class Area {
double areaOfCircle(int r){
    double area = Math.PI*r*r;
    return area;
    }
}
public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = sc.nextInt();
        Area obj = new Area();
        double area = obj.areaOfCircle(r);
        System.out.println("The area of the circle is: " + area);
    }
}