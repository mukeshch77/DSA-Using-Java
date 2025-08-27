import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Mukesh");
        map.put(2, "Aman");
        System.out.println(map);
        map.putIfAbsent(1, "Simran");
        System.out.println(map);
        map.put(1, "Anshul");

        System.out.println(map);
    }
}
