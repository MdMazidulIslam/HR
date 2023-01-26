package Hacker_Rank;
import java.util.*;
public class Pangrams {
    public static String call(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                return "not pangram";
            }
        }
        return "pangram";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String str = sc.nextLine();
        String str1= str.toUpperCase();

        for (int i = 0; i < str1.length(); i++){
            int a = 65;
            int result = str1.charAt(i) - a;
            if (result >= 0 && result <= 26){
                arr[result] +=1;
            }
        }

        String result = call(arr);
        System.out.println(result);

    }
}
