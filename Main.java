class WaterBottle {
    String color;
    int capacity;

    void fill() {
        System.out.println("Bottle is filled");
    }
}
//child class

class Thermos extends WaterBottle {
    void keepHot() {
        System.out.println("Thermos keeps water hot");
    }
}

public class Main {
    public static void main(String[] args) {
        WaterBottle bottle1 = new WaterBottle(); // Object
        Thermos thermos1 = new Thermos(); // Object
        thermos1.color = "Red";
        bottle1.color = "Blue";
        bottle1.capacity = 1000;

        bottle1.fill(); //inherited method
        thermos1.keepHot(); // own method
        thermos1.fill(); // inherited method
        System.out.println("Bottle color: " + bottle1.color);
        System.out.println("Thermos color: " + thermos1.color);
    }
}
