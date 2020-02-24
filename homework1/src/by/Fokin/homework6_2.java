package by.Fokin;

import java.util.Scanner;

public class homework6_2 {
    public static void main(String[] args) {
        System.out.println("Enter day");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter month");
        Scanner scan1 = new Scanner(System.in);
        String b = scan1.next();
        System.out.println("Enter year");
        Scanner scan2 = new Scanner(System.in);
        int c = scan2.nextInt();
        if (a == 31 && b.equals("December")) {
            a = 1;
            b = "January";
            c += 1;
        }
        if (a == 31 && b.equals("January")) {
            a = 1;
            b = "February";
        }
        if (c % 4 == 0) { // проверка является ли год високосным!
            if (a == 29 && b.equals("February")) {
                a = 1;
                b = "March";
            }
        }
        else {
            if (a == 28 && b.equals("February")) {
                a = 1;
                b = "March";
            }
        }
        if (a == 31 && b.equals("March")) {
            a = 1;
            b = "April";
        }
        if (a == 30 && b.equals("April")) {
            a = 1;
            b = "May";
        }
        if (a == 31 && b.equals("May")) {
            a = 1;
            b = "June";
        }
        if (a == 30 && b.equals("June")) {
            a = 1;
            b = "July";
        }
        if (a == 31 && b.equals("July")) {
            a = 1;
            b = "August";
        }
        if (a == 31 && b.equals("August")) {
            a = 1;
            b = "September";
        }
        if (a == 30 && b.equals("September")) {
            a = 1;
            b = "October";
        }
        if (a == 31 && b.equals("October")) {
            a = 1;
            b = "November";
        }
        if (a == 30 && b.equals("November")) {
            a = 1;
            b = "December";
        } else {
            a += 1;
        }
        System.out.println("Tomorrow's date: " + a + " " + b + " " + c + " year");
    }
}
