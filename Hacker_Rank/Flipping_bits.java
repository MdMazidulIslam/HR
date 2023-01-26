package Hacker_Rank;
import java.util.*;
public class Flipping_bits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        for (int i = 0; i < time; i++){
            long n = sc.nextLong();
            long bit = (1L << 32)-1;
            System.out.println(n^bit);
        }
    }
}
