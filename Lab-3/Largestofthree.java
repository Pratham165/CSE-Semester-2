import java.util.Scanner;

public class Largestofthree {
     public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no 1");
        double a= sc.nextDouble();
        System.out.println("enter the no 2");
        double b= sc.nextDouble();
         System.out.println("enter the no 3");
        double c= sc.nextDouble();

        if(a>b){
            if(a>c){
                System.out.println("a is max num ");
            }
            else{
                System.err.println("cis max num:");
            }
        }

        else{
            if(b>c){
                System.out.println("b is num is max");
            }
            else{
                System.out.println("b is max number:");
            }
        }
     }
}
