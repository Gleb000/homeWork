package by.Fokin;

import java.util.Scanner;

public class homework14 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во оценок");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ms = new int[n];
        int max = 0, num = 0;
        for (int i = 0; i < n; i += 1) {
            i += 1;
            System.out.println("Введите " + i + " значение массива");
            i -= 1;
            Scanner scan1 = new Scanner(System.in);
            ms[i] = scan1.nextInt();
            if (ms[i] > max) {
                num = i + 1;
            }
        }
        System.out.println("Оценка под номером " + num + " больше остальных");
    }
}
