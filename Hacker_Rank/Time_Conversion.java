package Hacker_Rank;
import java.util.*;
public class Time_Conversion {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        char DorN = time.charAt(time.length()-2);
        if (DorN == 'A'){
            int hh = Integer.parseInt(time.substring(0,2));
            if (hh == 12){
                hh = 0;
            }
            String t = Integer.toString(hh);
            if (t.length() == 1){
                t = "0"+t;
            }
            System.out.println(t+time.substring(2,time.length()-2));
        }else {
            int hh = Integer.parseInt(time.substring(0,2));
            if (hh != 12){
                hh += 12;
            }
            String t = Integer.toString(hh);
            if (t.length() == 1){
                t = "0"+t;
            }
            System.out.println(t+time.substring(2,time.length()-2));
        }
    }
}
