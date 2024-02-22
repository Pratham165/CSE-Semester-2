import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter elements of array"+a[i]+":");
            a[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}