package by.Fokin;

import java.util.Scanner;

public class homework6_1 {
    public static void main(String[] args) {
        System.out.println("Укажите сегодняшний день");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Укажите сегодняшний месяц");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        System.out.println("Укажите сегодняшний год");
        Scanner scan2 = new Scanner(System.in);
        int c = scan2.nextInt();
        if (a == 31 && b == 12) {
            a = 1;
            b = 1;
            c += 1;
        }
        else if (a == 31 && b == 1 || a == 29 && b == 2 || a == 31 && b == 3 || a == 30 && b == 4|| a == 31 && b == 5 ||
                a == 30 && b == 6 || a == 31 && b == 7 || a == 31 && b == 8 || a == 30 && b == 9 || a == 31 && b == 10 || a == 30 && b == 11) {
            a = 1;
            b += 1;
        }
        else {
            a += 1;
        }
        System.out.println("Завтрашняя дата: " + a + "." + b + "." + c);
    }
}
