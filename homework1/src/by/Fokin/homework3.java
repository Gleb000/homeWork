package by.Fokin;

import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = a % 10;
        if (n == 7) {
            System.out.println("Последняя цифра числа " + a + " 7");
        }
        else {
            System.out.println("Последняя цифра числа " + a + " не 7");
        }
    }
}
