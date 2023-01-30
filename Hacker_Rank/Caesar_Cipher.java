package Hacker_Rank;

import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lofs = sc.nextInt();
        String str = sc.next();
        int roted = sc.nextInt();
        if (roted > 25){
            roted=roted%26;
        }
        System.out.println(roted);
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            int temp = str.charAt(i);
            if (65 <= temp && 90 >= temp || 97 <= temp && 122 >= temp){
                if (65 <= temp && 90 >= temp && temp + roted > 90){
                    roted = (temp + roted) - 90;
                    newStr += (char)(65+(roted-1));
                } else if(97 <= temp && 122 >= temp && temp + roted > 122){
                    roted = (temp + roted) - 122;
                    newStr += (char)(97+(roted-1));
                }else {
                    newStr += (char)(str.charAt(i)+roted);
                }
            }else {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
// a b c d e f g h i j k l m n o p q r s t u v w x y z a b
//