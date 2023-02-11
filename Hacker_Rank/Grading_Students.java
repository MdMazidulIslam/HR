package Hacker_Rank;

import java.util.Scanner;

public class Grading_Students {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++){
            int temp = sc.nextInt();
            if (temp < 45 && temp >= 40){
                if (45 - temp < 3){
                    arr[i]= 45;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 50 && temp >= 46) {
                if (50 - temp < 3){
                    arr[i]= 50;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 55 && temp >= 51) {
                if (55 - temp < 3){
                    arr[i]= 55;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 60 && temp >= 56) {
                if (60 - temp < 3){
                    arr[i]= 60;
                }else {
                    arr[i]=temp;
                }
            }
            else if (temp < 65 && temp >= 61) {
                if (65 - temp < 3){
                    arr[i]= 65;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 70 && temp >= 65) {
                if (70 - temp < 3){
                    arr[i]= 70;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 75 && temp >= 71) {
                if (75 - temp < 3){
                    arr[i]= 75;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 80 && temp >= 75) {
                if (80 - temp < 3){
                    arr[i]= 80;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 85 && temp >= 81) {
                if (85 - temp < 3){
                    arr[i]= 85;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 90 && temp >= 86) {
                if (90 - temp < 3){
                    arr[i]= 90;
                }else {
                    arr[i]=temp;
                }
            }
            else if (temp < 95 && temp >= 91) {
                if (95 - temp < 3){
                    arr[i]= 95;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 100 && temp >= 95) {
                if (100 - temp < 3){
                    arr[i]= 100;
                }else {
                    arr[i]=temp;
                }
            }else if (temp < 40 && temp >= 35) {
                if (40 - temp < 3){
                    arr[i]= 40;
                }else {
                    arr[i]=temp;
                }
            }else {
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
