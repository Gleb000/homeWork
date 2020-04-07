package by.Fokin;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework20 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку содержащую пробелы и символы");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < s.length(); i += 1) {
            if(i == s.length() - 1 && c[i] != ' ') {
                list.add(counter, c[i]);
                break;
            }
            if(i == s.length() - 1 && c[i] == ' ') {
                break;
            }
            if (c[i] != ' ' && c[i + 1] == ' ') {
                list.add(counter, c[i]);
                counter += 1;
            }
        }
        System.out.println("Строка, состоящая из последних букв всех слов:");
        for(Character ch : list) {
            System.out.print(ch);
        }
    }
}
