// ✅ Interface (Abstraction)
interface Fillable {
    void fill(); // abstract by default
}

// ✅ Base class
class WaterBottle implements Fillable {
    String color;
    int capacity;

    @Override
    public void fill() {
        System.out.println("Bottle is filled");
    }

    // ✅ Overloading (compile-time polymorphism)
    void fill(String liquid) {
        System.out.println("Bottle is filled with " + liquid);
    }
}

// ✅ Child class (Inheritance + Overriding)
class Thermos extends WaterBottle {

    void keepHot() {
        System.out.println("Thermos keeps water hot");
    }

    // ✅ Runtime polymorphism (overriding)
    @Override
    public void fill() {
        System.out.println("Thermos is filled with hot water");
    }
}

// ✅ Another class to show abstraction clearly
class ColdBottle implements Fillable {

    @Override
    public void fill() {
        System.out.println("Cold bottle is filled with cold water");
    }
}
// Encapsulation Class
class BottleData{
    private String color;
    private int capacity;

    //Getter
    public String getColor() {
        return color;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid capacity!");
        }

    }
}


public class Main {
    public static void main(String[] args) {

        // Normal objects
        WaterBottle bottle1 = new WaterBottle();
        Thermos thermos1 = new Thermos();

        bottle1.color = "Blue";
        thermos1.color = "Red";
        bottle1.capacity = 1000;

        // ✅ Runtime Polymorphism
        WaterBottle obj = new Thermos();
        obj.fill();   // calls Thermos version

        // ✅ Abstraction (interface reference)
        Fillable f1 = new WaterBottle();
        Fillable f2 = new Thermos();
        Fillable f3 = new ColdBottle();

        f1.fill();   // Bottle
        f2.fill();   // Thermos
        f3.fill();   // ColdBottle

        // ✅ Normal calls
        bottle1.fill();
        bottle1.fill("Juice");   // overloading

        thermos1.keepHot();
        thermos1.fill();

        System.out.println("Bottle color: " + bottle1.color);
        System.out.println("Thermos color: " + thermos1.color);

        
// ✅ NEW: Using Encapsulation (separate class)
        BottleData data1 = new BottleData();
        BottleData data2 = new BottleData();

        data1.setColor("Green");
        data1.setCapacity(2000);

        data2.setColor("Black");
        data2.setCapacity(-500); // invalid

        System.out.println("Encapsulated Bottle 1 Color: " + data1.getColor());
        System.out.println("Encapsulated Bottle 1 Capacity: " + data1.getCapacity());

        System.out.println("Encapsulated Bottle 2 Color: " + data2.getColor());
        System.out.println("Encapsulated Bottle 2 Capacity: " + data2.getCapacity());

    }
}