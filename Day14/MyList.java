import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // cap -> 10
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(7);
        System.out.println(list);
        // System.out.println(list.size());

        // list.remove(Integer.valueOf(5));
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);

        // System.out.println(list.contains(7));

        // System.out.println(list.get(0));

        // System.out.println(list.set(0, 4));
        // System.out.println(list);

        // Iterator<Integer> itr = list.iterator();
        // System.out.println("My List -->");
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // Sorting

        // list.sort(new Comparator<Integer>() {
        //     public int compare(Integer A, Integer B) {
        //         return A - B;
        //     }
        // });
        // System.out.println(list);
        
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10, "Mukesh"));
        list1.add(new Student(10, "Rahul"));
        list1.add(new Student(10, "Rakesh"));
        list1.add(new Student(3, "Sim"));
        list1.add(new Student(16, "Choudhary"));

        list1.sort(new Comparator<Student>() {
            public int compare(Student A, Student B) {
                // return B.rollNumber - A.rollNumber;

                int res = B.rollNumber - A.rollNumber;
                if (res == 0) {
                    return A.name.compareTo(B.name);
                }
                return res;
            }
        });
        System.out.println(list1);

    }
}

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
