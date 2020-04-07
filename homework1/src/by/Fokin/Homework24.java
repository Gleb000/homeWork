package by.Fokin;

public class Homework24 {

    public static void main(String[] args) {
        LargeHomeAppliances washer = new Washer("Стиральная Машинка");
        washer.plugIn();
        System.out.println(washer.isLarge());

        SmallHouseholdAppliances blender = new Blender("Блендер");
        blender.plugIn();
        System.out.println(blender.isSmall());
    }
}

abstract class Appliances {

    abstract void plugIn();

}

abstract class LargeHomeAppliances extends Appliances {

    abstract boolean isLarge();

}

abstract class SmallHouseholdAppliances extends Appliances {

    abstract boolean isSmall();

}

class Blender extends SmallHouseholdAppliances {

    private String name1;
    private double size1 = 0.25;

    public Blender(String name1) {
        this.name1 = name1;
    }

    @Override
    void plugIn() {
        System.out.println(this.name1 + " включен(а) в розетку");
    }

    @Override
    boolean isSmall() {
        System.out.println("(Мелкая бытовая техника?)");
        return size1 <= 0.35;
    }
}

class Washer extends LargeHomeAppliances {

    private String name2;
    private double size2 = 0.95;

    public Washer(String name2) {
        this.name2 = name2;
    }

    @Override
    void plugIn() {
        System.out.println(this.name2 + " включен(а) в розетку");
    }

    @Override
    boolean isLarge() {
        System.out.println("(Крупная бытовая техника?)");
        return size2 > 0.35;
    }
}
