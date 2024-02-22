import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string;");
        String a = sc.nextLine();
        int vov = 0;
        while(a!="quit"){
            System.out.println("Enter a new string;");
            for(int i = 0;i>a.length();i++){
                if(a.charAt(i)=='A'|a.charAt(i)=='E'|a.charAt(i)=='I'|a.charAt(i)=='O'|a.charAt(i)=='U'|a.charAt(i)=='a'|a.charAt(i)=='e'|a.charAt(i)=='i'|a.charAt(i)=='o'|a.charAt(i)=='u'){
                    vov++;
                }
            }

        }
        System.out.println("The totel no. of vovel till now is : "+vov);
        
    }
    
}
