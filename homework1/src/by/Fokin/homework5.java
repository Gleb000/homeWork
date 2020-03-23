package by.Fokin;

import java.util.Scanner;

public class homework5 {

    public static void main(String[] args) {
        System.out.println("Введите сумму денег");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int g = a % 10;
        if (g == 0 || g == 5 || g == 6 || g == 7 || g == 8 || g == 9) {
            System.out.println(a + " рублей");
        }
        else if (g == 1) {
            System.out.println(a + " рубль");
        }
        else if (g == 2 || g == 3 || g == 4) {
            System.out.println(a + " рубля");
        }
    }
}
