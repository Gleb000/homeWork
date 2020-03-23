package by.Fokin;

import java.util.Scanner;

public class homework11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int g = 0;
        for (int i = 2; i < a; i += 1) {
            if (a % i == 0) {
                System.out.println("Число " + a + " не простое");
                g = 1;
                break;
            }
        }
        if (g == 0) {
            System.out.println("Число " + a + " простое");
        }
    }
}
