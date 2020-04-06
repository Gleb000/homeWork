package by.Fokin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework26 {

    public static void main(String[] args) {

        ArrayList<Integer> listOfRatings = new ArrayList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите кол-во оценок: ");
        int value = scan.nextInt();
        for(int i = 0; i < value; i += 1) {
            listOfRatings.add(i, 1 + rand.nextInt(10));
        }
        System.out.println("Список неотсортированных оценок");
        for (Integer list : listOfRatings) {
            System.out.print(list + " ");
        }
        System.out.println();
        int counter = 0;
        for(int i = 0; i < listOfRatings.size(); i += 1) {
            if(listOfRatings.get(i) < 4) {
                listOfRatings.remove(i);
                i -= 1;
                counter += 1;
            }
        }
        System.out.println("Конечный список оценок");
        for (Integer list : listOfRatings) {
            System.out.print(list + " ");
        }
        System.out.println();
        System.out.println("Оценок удалено: " + counter);
    }
}
