package by.Fokin;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int sec, m, min, h, hou, d, day, w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hou = h % 24;
        d = (h - hou) / 24;
        day = d % 7;
        w = (d - day) / 7;
        System.out.println(w + " недель " + day + " дней " + hou + " часов " + min + " минут " + sec + " секунд");
    }
}
