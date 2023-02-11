package Hacker_Rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Missing_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for (int i = 0; i < n1; i++){
            list.add(arr1[i]);
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        for (int i = 0; i < n2; i++){
            list1.add(arr2[i]);
        }
        for (int i = 0; i < list.size(); i++){
            list1.remove(list.get(i));
        }
        for (int i = 0; i < list1.size()-1; i++){
            int curr = list1.get(i);
            int curNext = list1.get(i+1);
            if (curr == curNext){
                list1.remove(i);
            }
        }
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
    }
}

//3 3 4 4 4 5 5 5 6 6 6 7 8
//3 3 4 4 5 5 6 6 7 8