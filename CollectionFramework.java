import java.util.*;
public class CollectionFramework {
    public static void main(String[] args) {
        // Implementing Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John Cena");
        map.put(2, "Sunny Leone");
        map.put(3, "BobBy Deol");
        System.out.println("Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Implementing List
        List<String> list = new ArrayList<>();
        list.add("Naspati");
        list.add("Aapp");
        list.add("Suntala");

        System.out.println("\nList:");
        for (String item : list) {
            System.out.println(item);
        }
        // Implementing Set
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Black");
        set.add("White");
        System.out.println("\nSet:");
        for (String color : set) {
            System.out.println(color);
        }
    }
}

