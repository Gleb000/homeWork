package by.Fokin;

import java.util.Scanner;

public class Homework23 {

    private int Money = 3000;

    private Homework23() {
        System.out.println("Банкомат готов к работе");
    }

    private boolean giveOutMoney(int a, int b) {
        int g;
        boolean test = false;
        if(a == 1) {
            g = 20 * b;
            if(g <= Money) {
                Money -= g;
                System.out.println("Банкомат выдал " + b + " купюр номиналом 20");
                test = true;
            }
        } if (a == 2){
            g = 50 * b;
            if(g <= Money) {
                Money -= g;
                System.out.println("Банкомат выдал " + b + " купюр номиналом 50");
                test = true;
            }
        } if (a == 3) {
            g = 100 * b;
            if(g <= Money) {
                Money -= g;
                System.out.println("Банкомат выдал " + b + " купюр номиналом 100");
                test = true;
            }
        }
        return test;
    }

    private boolean putMoney(int a, int b) {
        int g;
        boolean test = false;
        if(a == 1) {
            g = 20 * b;
            Money += g;
            System.out.println("Вы положили в банкомат " + b + " купюр номиналом 20");
            test = true;
        } if (a == 2){
            g = 50 * b;
            Money += g;
            System.out.println("Вы положили в банкомат " + b + " купюр номиналом 50");
            test = true;
        } if (a == 3) {
            g = 100 * b;
            Money += g;
            System.out.println("Вы положили в банкомат " + b + " купюр номиналом 100");
            test = true;
        }
        return test;
    }

    public int getMoney() {
        return Money;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Homework23 bankomat = new Homework23();

        int a, b, act;
        while(true) {
            System.out.println("Выберите вид операции:");
            System.out.println("1) Снять деньги");
            System.out.println("2) Положить деньги");
            System.out.println("3) Закончить сеанс");
            act = scan.nextInt();
            if(bankomat.getMoney() == 0 && act == 1) {
                System.out.println("На данный момент в банкомате закончились деньги, приносим свои извинения");
                while (act != 2 && act != 3) {
                    System.out.println("Выберите другую операцию");
                    System.out.println("1) —-— —----");
                    System.out.println("2) Положить деньги");
                    System.out.println("3) Закончить сеанс");
                    act = scan.nextInt();
                }
            } else {
                while (act != 1 && act != 2 && act != 3) {
                    System.out.println("Выберите нужную операцию заново");
                    System.out.println("1) Снять деньги");
                    System.out.println("2) Положить деньги");
                    System.out.println("3) Закончить сеанс");
                    act = scan.nextInt();
                }
            }
            if(act == 1) {
                System.out.println("Выберите номинал:");
                System.out.println("1) 20");
                System.out.println("2) 50");
                System.out.println("3) 100");
                a = scan.nextInt();
                while(a != 1 && a != 2 && a != 3) {
                    System.out.println("Выберите номинал еще раз");
                    a = scan.nextInt();
                }
                System.out.println("Введите кол-во купюр, которое требуется снять");
                b = scan.nextInt();
                System.out.println(bankomat.giveOutMoney(a, b));
            } if (act == 2) {
                System.out.println("Выберите номинал:");
                System.out.println("1) 20");
                System.out.println("2) 50");
                System.out.println("3) 100");
                a = scan.nextInt();
                while(a != 1 && a != 2 && a != 3) {
                    System.out.println("Выберите номинал еще раз");
                    a = scan.nextInt();
                }
                System.out.println("Введите кол-во купюр, которое вы хотите положить в банкомат");
                b = scan.nextInt();
                System.out.println(bankomat.putMoney(a, b));
            } if (act == 3) {
                System.out.println("Всего наилучшего!");
                System.exit(0);
            }
        }
    }
}
