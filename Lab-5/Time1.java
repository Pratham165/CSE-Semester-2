
import java.util.Scanner;
class Logic{
    int time(int hh,int mm,int ss){     
        return hh*3600+mm*60+ss;
    }
}
public class Time1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic obj = new Logic();
        System.out.print("Enter hours in hh format: ");
        int hh = sc.nextInt();
        if (hh >= 24) {
            hh %= 24;
        }
        System.out.print("Enter minutes in mm format: ");
        int mm = sc.nextInt();
        if (mm >= 60) {
            hh += mm / 60;
            mm %= 60;
        }
        System.out.print("Enter seconds in ss format: ");
        int ss = sc.nextInt();
        if (ss >= 60) {
            mm += ss / 60;
            ss %= 60;
        }
        int t = obj.time(hh, mm, ss);
        System.out.print(hh + ":" + mm + ":" + ss);
    
        Time t1 = new Time();
        Time t2 = new Time(10, 45);
        t1.addition(hh, t2.h, mm, t2.m); 
        System.out.println(t1.h + ":" + t1.m + ":");
    }
}
class Time{
    int h,m;
    Time(){
        h = 12;
        m = 30;
    }
    Time(int hh,int mm){
        this.h = hh;
        this.m = mm;
    }
void addition(int t1h,int t2h,int t1m,int t2m){
    int hours = t1h + t2h;
    int minutes = t1m + t2m;
    if(minutes>=60){
        hours+=minutes/60;
        minutes%=60;
    }
    System.out.println(hours+":"+minutes);
}
    
}
