import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        // map.put(1, "Mukesh");
        // map.put(2, "Aman");
        // System.out.println(map);
        // map.putIfAbsent(1, "Simran");
        // System.out.println(map);
        // map.put(1, "Anshul");

        // System.out.println(map);


        map.put(1, "Mukesh");
        map.put(2, "Aman");
        map.put(3, "Simran");
        map.put(4, "Anshul");
        map.put(2, "Akash");
        
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(5));
        System.out.println(map.getOrDefault(5, "No one"));
        System.out.println(map.getOrDefault(1, "No one"));
        
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Mukesh"));
        System.out.println(map.containsKey(2));
        System.out.println(map.get(4));
    }
}
