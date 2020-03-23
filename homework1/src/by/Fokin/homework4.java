package by.Fokin;

import java.util.Scanner;

public class homework4 {

    double s;

    double sqrt (int a, int b) {
        int g, h;
        double e = 0;
        g = a * a;
        h = b * b;
        e = g + h;
        s = Math.sqrt((double) e);
        return s;
    }

    public static void main(String[] args) {
        homework4 rectangle = new homework4();
        System.out.println("Введите первую сторону прямоугольника");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите вторую сторону прямоугольника");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        System.out.println("Введите радиус круга");
        Scanner scan2 = new Scanner(System.in);
        double r = scan2.nextInt();
        rectangle.sqrt((int) a, (int) b);
        if (rectangle.s == r * 2 || rectangle.s < r * 2) {
            System.out.println("Можно закрыть");
        }
        else {
            System.out.println("Закрыть нельзя");
        }
    }
}
