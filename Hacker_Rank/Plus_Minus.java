package Hacker_Rank;
import java.util.*;
public class Plus_Minus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int [n];
        int p = 0;
        int ne = 0;
        int z = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i]<0){
                ne++;
            } else if (arr[i]>0) {
                p++;
            }else {
                z++;
            }
        }
        float a = p;
        float b = ne;
        float c = z;//.%6f

        System.out.printf("%f\n", a/arr.length);
        System.out.printf("%f\n", b/arr.length);
        System.out.printf("%f\n", c/arr.length);


    }
}
