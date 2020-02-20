package by.Fokin;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0, h;
        do {
            h = a % 10;
            a /= 10;
            sum += h;
        } while (a != 0);
        System.out.println("Сумма = " + sum);
    }
}
