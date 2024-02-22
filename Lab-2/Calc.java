import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
       System.out.print("Enter number1:");
       int num1 = cs.nextInt();
       System.out.print("Enter num2:");
       int num2 = cs.nextInt();
       System.out.print("Enter operator to perform the task:");
       char op = cs.next().charAt(0);
       switch (op) {
        case ('+'):
        int sum = num1+num2;
        System.out.println("The sum of number is:"+sum);
            break;
            case ('-'):
            int diff = num1-num2;
            System.out.println("The difference of number is:"+diff);
            break;
            case ('*'):
            int product = num1*num2;
            System.out.println("The product of two number is:"+product);
            break;
            case('/'):
            double div = (double)num1/num2;
            System.out.println("The division of two number is:"+div);
            break;
       
        default:
            System.out.println("Not a valid operator");
            break;
       } 
        

    }
    
}
