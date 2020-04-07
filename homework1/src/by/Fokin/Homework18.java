package by.Fokin;

import java.util.Scanner;

public class Homework18{

    public static void main(String[] args) {

        int counter = 0;
        char msznak[] = new char[]{',', '.', ':', ';', '!', '?'};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку!");
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i += 1) {
            for(int j = 0; j < 6; j += 1) {
                if(str.charAt(i) == msznak[j]) {
                    counter += 1;
                    break;
                }
            }
        }
        if(counter == 0)
            System.out.println("Знаки препинания в веденной вами строке не найдены");
        else
            System.out.println("Кол-во знаков препинания в веденной вами строке = " + counter);
    }
}
