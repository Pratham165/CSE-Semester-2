import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.displayAccountDetails();
        
    }
}


class Bank_Account {
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    void getAccountDetails() {
        Scanner as = new Scanner(System.in);
        System.out.print("Enter your account no. : ");
        int accountNo = as.nextInt();
        System.out.print("Enter your name : ");
        String userName = as.next();
        System.out.print("Enter your account no. : ");
        String email = as.next();
        System.out.print("Enter your account type: ");
        String accountType = as.next();
        System.out.print("Enter your account balance no. : ");
        int accountBalance = as.nextInt();
    }
    public void displayAccountDetails(){
        System.out.println("\n Account Details are as follows \n");
        System.out.println("Account No.: " + accountNo);
        System.out.println("User Name  : " + userName);
        System.out.println("Email      : " + email);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Account Balance : " + accountBalance);
        }

    }

