import java.util.*;
class Collections{
    public static void main(String[] args){

        // ArrayList : A List stores ordered elements and allows duplicates.
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello"); // ArrayList allows duplicates

        System.out.println("ArrayList: " + list);

        //HashSet : A Set stores unique elements and does not allow duplicates.
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hello"); // HashSet does not allow duplicates

        System.out.println("HashSet: " + set);

        //HashMap : A Map stores key-value pairs and does not allow duplicate keys.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("One", 11); // HashMap does not allow duplicate keys, it will overwrite the value for key "One"

        System.out.println("HashMap: " + map);
    }
}
