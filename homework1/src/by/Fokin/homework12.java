package by.Fokin;

import java.util.Scanner;

public class homework12 {

    public static void main(String[] args) {
        System.out.println("Сколько чисел вы хотите ввести");
        Scanner scan1 = new Scanner(System.in);
        int i = scan1.nextInt();
        int j = 0, g = -99999999;
        while (j < i) {
            System.out.println("Введите число");
            Scanner scan2 = new Scanner(System.in);
            int a = scan2.nextInt();
            if (a > g) {
                g = a;
            }
            j++;
        }
        System.out.println("Наибольшее число из всех введенных вами чисел = " + g);
    }
}
