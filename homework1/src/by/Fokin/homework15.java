package by.Fokin;

import java.util.Random;
import java.util.Scanner;

public class homework15 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ms = new int[n];
        int sum = 0, i = 0, min = 0, max = 0, minel = 99999999, maxel = -99999999;
        for (i = 0; i < n; i += 1) {
            i += 1;
            System.out.println(i + " элемент");
            i -= 1;
            Scanner scan1 = new Scanner(System.in);
            ms[i] = scan1.nextInt();
            if(minel > ms[i]) {
                minel = ms[i];
                min = i;
            }
            if(maxel < ms[i]) {
                maxel = ms[i];
                max = i;
            }
        }
        for(i = min + 1; i < max; i += 1) {
            sum += ms[i];
        }
        System.out.println("Сумма элементов расположенных между минимальным и максимальным значением = " + sum);
    }
}
