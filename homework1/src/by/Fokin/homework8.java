package by.Fokin;

import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        System.out.println("Enter fact");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0, i = 0, fact = 1;
        if (a == 0) {
            System.out.println("Error 404");
            System.exit(-1);
        }
        do {
            b += 1;
            fact *= b;
            i += 1;
        } while(i < a);
        System.out.println("Factorial = " + fact);
    }
}
