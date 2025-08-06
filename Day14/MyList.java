import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(7);
        System.out.println(list);
        list.remove(Integer.valueOf(5));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
