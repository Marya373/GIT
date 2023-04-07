package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1}; //задать массив и поменять 0 на 1 и 1 на  0
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + "");
        }
    }
    public static void main1(String[] args) { //числа меньше 6 умножить на 2
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas[i] + "");
        }
    }
    public static void main2(String[] args){ //создать и заполнить двумерный массив по диагонали единицами
        int n = 4;
        int [][] array = new int[n][n];
        for (int i =0; i < n; i ++){
            array[i][i] = 1;
            array[i][n - i -1] = 1;
        }
    }
    public boolean doTree (int a, int b) {
        System.out.println("\n ");
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            var b1 = true;
            return b1;
        } else return false;
    }
    private static boolean pozitiv (int x){
        System.out.println("");
        if (x > 0 ) return true;
        return false;
    }
    private static boolean isLeapYear (int year){
        System.out.println("\n");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + "г. не високосный");
        else System.out.println(year + "г. високосный");
        return false;
    }
    private static String printString(String str, int i){ //напечатать строку repeat раз
        String result = "";
        str = "".repeat(i);
        return result;
    }
    private static int[] createArray(int len, int initialValue){ //возврат массива длины len, значения которого равны initialValue
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
