import java.util.Scanner;
class Member{
    String Name;
    int Age;
    long Num;
    String Address;
    int Salary;
    Member(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the employee/manager:");
        Name = sc.nextLine();
        System.out.print("Enter Age of the employee/manager:");
        Age = sc.nextInt();
        System.out.print("Enter Num:");
        Num = sc.nextLong();
        System.out.print("Enter Address:");
        Address = sc.next();
    }
    void printSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary of the employee/manager:");
        Salary = sc.nextInt();
    }
    
}

class Employee extends Member{
    Employee(){
        super();
        Scanner sc = new Scanner(System.in);
        String Specialisation;
        System.out.print("Enter Specialisation of the Employee:");
        Specialisation = sc.next();
    }
    public void Edata(){
        
    }
}
class Manager extends Member{
    Manager(){
        super();
        Scanner sc = new Scanner(System.in);
        String Department;
        System.out.print("Enter Department of the manager:");
        Department = sc.next();
    }
}


public class Office{
    public static void main(String[] args){
        

    }
}