class WaterBottle {
    String color;
    int capacity;

    void fill() {
        System.out.println("Bottle is filled");
    }
}

public class Main {
    public static void main(String[] args) {
        WaterBottle bottle1 = new WaterBottle(); // Object
        bottle1.color = "Blue";
        bottle1.capacity = 1000;

        bottle1.fill();
    }
}
