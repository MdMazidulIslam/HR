package Hacker_Rank;

import java.util.Scanner;

/**
 * public static String hackerrankInString(String s) {
 *     // Write your code here
 *         String st = "hackerrank";
 *         int idx = 0;
 *         for (int i = 0; i < s.length(); i++){
 *                 if (idx == 9){
 *                     break;
 *                 }
 *                 if (st.charAt(idx) == s.charAt(i)){//rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
 *                     idx++;
 *                 }
 *             }
 *         if(idx == 9){
 *                 return "YES";
 *         }
 *         return "NO";
 *
 *     }
 */

public class HackerRank_in_a_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String st = "hackerrank";
        int idx = 0;
        int n = sc.nextInt();
        for (int j = 0; j < n ; j++){
            String str = sc.next();

            for (int i = 0; i < str.length(); i++){
                if (idx == 9){
                    break;
                }
                if (st.charAt(idx) == str.charAt(i)){//rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
                    idx++;
                }
            }
            if(idx != 9){
                System.out.println("NO");
            }else {
//                System.out.println(idx);
                System.out.println("YES");
            }
        }


//        System.out.println();

    }
}
