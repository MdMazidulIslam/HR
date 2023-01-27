package Hacker_Rank;
/*
import java.util.*;
public class XOR_Strings_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++){
            char temp = str1.charAt(i);
            if (temp == str2.charAt(i)){
                str.append("0");
            }
            else {
                str.append("1");
            }
        }
        System.out.println(str);
    }
}
 */

import java.util.*;
public class XOR_Strings_2 {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }
    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }
}