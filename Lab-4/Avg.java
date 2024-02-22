import java.util.Scanner;
public class Avg{
    public static void main(String[] args)
    {
        int[] a = new int[4];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter elements of array"+a[i]+":");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        avg = (double)sum/4;
        System.out.println("The avg of numbers is:"+avg);
    }
}