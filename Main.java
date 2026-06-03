class WaterBottle {
    String color;
    int capacity;

    void fill() {
        System.out.println("Bottle is filled");
    }

    // ✅ Overloading , compile-time polymorphism :same method name but different parameters
    void fill(String liquid) {
        System.out.println("Bottle is filled with " + liquid);
    }
}

// child class
class Thermos extends WaterBottle {

    void keepHot() {
        System.out.println("Thermos keeps water hot");
    }

    // ✅ Overriding (must be in child class),runtime: same method, different behavior
    @Override
    void fill() {
        System.out.println("Thermos is filled with hot water");
    }
}

public class Main {
    public static void main(String[] args) {

        WaterBottle bottle1 = new WaterBottle();
        Thermos thermos1 = new Thermos();

        thermos1.color = "Red";
        bottle1.color = "Blue";
        bottle1.capacity = 1000;

        // ✅ Runtime polymorphism
        WaterBottle obj = new Thermos();
        obj.fill();   // calls Thermos version

        // Normal calls
        bottle1.fill();                    
        bottle1.fill("Juice");             // overloading

        thermos1.keepHot();
        thermos1.fill();                  // overridden

        System.out.println("Bottle color: " + bottle1.color);
        System.out.println("Thermos color: " + thermos1.color);
    }
}
