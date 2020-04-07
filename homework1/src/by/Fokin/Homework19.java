package by.Fokin;

import java.util.Scanner;

public class Homework19 {

    private static Object Separator;

    public static void main(String[] args) {

        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку содержащую пробелы и символы");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        if(c[0] == ' ') {
            for(int i = 0; i < s.length(); i += 1) {
                if(c[i] == ' ' && c[i + 1] != ' ') {
                    counter += 1;
                }
            }
        } if(c[0] != ' ') {
            counter += 1;
            for(int i = 0; i < s.length(); i += 1) {
                if(c[i] == ' ' && c[i + 1] != ' ') {
                    counter += 1;
                }
            }
        }
        System.out.println("Кол-во слов в строке: " + counter);
    }
}
