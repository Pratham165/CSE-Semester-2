// Take one sentence and find the length of the last word
//package Extra;
import java.util.Scanner;
public class CheckWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String word1 = sc.nextLine();
        int indexOfSpace = word1.lastIndexOf(' ');
        if (indexOfSpace == -1){
            System.out.println("The length of the word is " + word1.length());
        } else{
            String lastword = word1.substring(indexOfSpace+1);
            System.out.println("The length of the last word is " + lastword.length() );
        }
            


        

    }
    
}
