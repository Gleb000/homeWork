package by.Fokin;

import java.util.Random;
import java.util.Scanner;

public class homework16 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ms = new int[n];
        int i = 0, j = 0, d = 0;
        for (i = 0; i < n; i += 1) {
            Random rand = new Random();
            ms[i] = -100 + rand.nextInt(100 + 100);
            System.out.print(ms[i] + " ");
            d = i;
        }
        j = i / 2;
        for (i = 0; i < j; i += 1) {
            int p = ms[i];
            ms[i] = ms[d];
            ms[d] = p;
            d -= 1;
        }
        System.out.println("");
        for(i = 0; i < n; i += 1) {
            System.out.print(ms[i] + " ");
        }
    }
}
