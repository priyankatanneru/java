import java.util.*;
class Collections{
    public static void main(String[] args){

        // ArrayList : A List stores ordered elements and allows duplicates.
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello"); // ArrayList allows duplicates

        System.out.println("ArrayList: " + list);
    }
}
