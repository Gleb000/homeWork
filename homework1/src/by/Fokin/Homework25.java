package by.Fokin;

public class Homework25 {

    public static void main(String[] args) {
        MasterCard goldMasterCard = new GoldMasterCard("MasterCard(Золотая)");
        System.out.println(goldMasterCard.payByCard());
        goldMasterCard.PayPass();

        System.out.println();

        VisaCard goldVisaCard = new GoldVisaCard("VisaCard(Золотая)");
        System.out.println(goldVisaCard.payByCard());
        goldVisaCard.PayWave();
    }

}

abstract class Card {

    abstract boolean payByCard();

}

abstract class MasterCard extends Card {

    abstract void PayPass();

}

abstract class VisaCard extends Card {

    abstract void PayWave();

}

class GoldMasterCard extends MasterCard {

    String name1;

    public GoldMasterCard(String name1) {
        this.name1 = name1;
    }

    @Override
    boolean payByCard() {
        System.out.println("Возможность оплатить картой");
        return true;
    }

    @Override
    void PayPass() {
        System.out.println("У платежной карты " + this.name1 + " имеется бесконтактная оплата с помощью PayPass");
    }
}

class GoldVisaCard extends VisaCard {

    String name2;

    public GoldVisaCard(String name2) {
        this.name2 = name2;
    }

    @Override
    boolean payByCard() {
        System.out.println("Возможность оплатить картой");
        return true;
    }

    @Override
    void PayWave() {
        System.out.println("У платежной карты " + this.name2 + " имеется бесконтактная оплата с помощью PayWave");
    }
}
