package by.Fokin;

import java.util.Scanner;

public class homework13_2 {
    public static void main(String[] args) {
        while (true) { // постоянный поиск простых чисел
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int g = 0;
            for (int i = 2; i < a; i += 1) {
                if (a % i == 0) {
                    System.out.println("Число не простое");
                    g = 1;
                    break;
                }
                if (i == a - 1) {
                    System.out.println("Число простое");
                }
            }
        }
    }
}
