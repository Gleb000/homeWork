package by.Fokin;

import java.util.Scanner;

public class homework7 {

    public static void main(String[] args) {
        System.out.println("Ширина первого дома");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.println("Длина первого дома");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();
        System.out.println("Ширина второго дома");
        Scanner scan3 = new Scanner(System.in);
        int c = scan3.nextInt();
        System.out.println("Длина второго дома");
        Scanner scan4 = new Scanner(System.in);
        int d = scan4.nextInt();
        System.out.println("Ширина участка");
        Scanner scan5 = new Scanner(System.in);
        int e = scan5.nextInt();
        System.out.println("Длина участка");
        Scanner scan6 = new Scanner(System.in);
        int f = scan6.nextInt();
        System.out.println("Выберите способ постановки домов");
        System.out.println("1) █ █\n");
        System.out.println("2) █");
        System.out.println("   █\n");
        System.out.println("3) █");
        System.out.println("     █");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int shir, dlin = 0;
        switch (n) {
            case 1:
                shir = a + c;
                if (b >= d) {
                    if (b <= f && shir <= e) {
                        System.out.println("Дома помещаются на данном участке");
                    }
                    else {
                        System.out.println("Дома не помещаются на данном участке");
                    }
                }
                if (b < d) {
                    if (d <= f && shir <= e) {
                        System.out.println("Дома помещаются на данном участке");
                    }
                    else {
                        System.out.println("Дома не помещаются на данном участке");
                    }
                }
                break;
            case 2:
                dlin = b + d;
                if (a >= c) {
                    if (a <= e && dlin <= f) {
                        System.out.println("Дома помещаются на данном участке");
                    }
                    else {
                        System.out.println("Дома не помещаются на данном участке");
                    }
                }
                if (a < c) {
                    if (a <= e && dlin <= f) {
                        System.out.println("Дома помещаются на данном участке");
                    }
                    else {
                        System.out.println("Дома не помещаются на данном участке");
                    }
                }
                break;
            case 3:
                shir = a = c;
                dlin = b + d;
                if (shir <= e && dlin <= f) {
                    System.out.println("Дома помещаются на данном участке");
                }
                else {
                    System.out.println("Дома не помещаются на данном участке");
                }
                break;
            default:
                System.out.println("Вы ввели не существующее значение!");
        }
    }
}
