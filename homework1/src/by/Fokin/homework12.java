package by.Fokin;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int a1 = a;
        int b = 0, i = 1, j = 0, sum = 0;
        while (a1 / 10 != 0) {
            a1 /= 10;
            i += 1;
        }
        int y = i;
        for (int u = 0; u < y; u += 1) {
            b = a % 10;
            a /= 10;
            j = 1;
            while(j != i) {
                b *= 10;
                j += 1;
            }
            sum += b;
            i -= 1;
        }
        int number = 1;
        int h = y % 3;
        while (true) {
            b = sum % 10;
            sum /= 10;
            System.out.print(b);
            if (number == h) {
                System.out.print(" ");
                number = 1;
                break;
            }
            number += 1;
        }
        for (int u = 0; u < y - h; u += 1) {
            b = sum % 10;
            System.out.print(b);
            if (number == 3) {
                System.out.print(" ");
                number = 0;
            }
            number += 1;
            sum /= 10;
        }
    }
}
