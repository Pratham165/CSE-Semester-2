import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line:");
        String str = sc.nextLine();
        int countc = 0 , count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
            else{
                countc++;
            }
        }
        System.out.println("Number of vowels:" + count);
        System.out.println("Number of consonants:" + countc);
    }
}