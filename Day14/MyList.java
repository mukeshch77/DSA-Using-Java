import java.util.*;

public class MyList {
    public static void main(String[] args) {

        // ArrayList 

        // List<Integer> list = new ArrayList<>();
        // // cap -> 10
        // list.add(1);
        // list.add(3);
        // list.add(7);
        // list.add(5);
        // list.add(7);
        // System.out.println(list);
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
        // ListIterator<Integer> itr1 = list.listIterator();

        // System.out.println("My List -->");
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // System.out.println("My List -->");
        // while (itr1.hasNext()) {
        //     System.out.println(itr1.next());
        //     if (itr1.hasPrevious()) {
        //         System.out.println(itr1.previous());
        //         break;
        //     }
        // }

        // // Sorting

        // list.sort(new Comparator<Integer>() {
        //     public int compare(Integer A, Integer B) {
        //         return A - B;
        //     }
        // });
        // System.out.println(list);

        // List<Student> list1 = new ArrayList<>();
        // list1.add(new Student(10, "Mukesh"));
        // list1.add(new Student(10, "Rahul"));
        // list1.add(new Student(10, "Rakesh"));
        // list1.add(new Student(3, "Sim"));
        // list1.add(new Student(16, "Choudhary"));

        // list1.sort(new Comparator<Student>() {
        // public int compare(Student A, Student B) {
        // // return B.rollNumber - A.rollNumber;

        // int res = B.rollNumber - A.rollNumber;
        // if (res == 0) {
        // return B.name.compareTo(A.name);
        // }
        // return res;
        // }
        // });
        // System.out.println(list1);
        


        // LinkedList

        // List<Integer> list = new LinkedList<>();  // Doubly LL
        // // cap -> 10
        // list.add(1);
        // list.add(3);
        // list.add(7);
        // list.add(5);
        // list.add(2, 18);
        // list.add(7);
        // System.out.println(list);
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
        // ListIterator<Integer> itr1 = list.listIterator();

        // System.out.println("My List -->");
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // System.out.println("My List -->");
        // while (itr1.hasNext()) {
        //     System.out.println(itr1.next());
        //     if (itr1.hasPrevious()) {
        //         System.out.println(itr1.previous());
        //         break;
        //     }
        // }

        // // Sorting

        // list.sort(new Comparator<Integer>() {
        //     public int compare(Integer A, Integer B) {
        //         return A - B;
        //     }
        // });
        // System.out.println(list);

        // List<Student> list1 = new ArrayList<>();
        // list1.add(new Student(10, "Mukesh"));
        // list1.add(new Student(10, "Rahul"));
        // list1.add(new Student(10, "Rakesh"));
        // list1.add(new Student(3, "Sim"));
        // list1.add(new Student(16, "Choudhary"));

        // list1.sort(new Comparator<Student>() {
        // public int compare(Student A, Student B) {
        // // return B.rollNumber - A.rollNumber;

        // int res = B.rollNumber - A.rollNumber;
        // if (res == 0) {
        // return B.name.compareTo(A.name);
        // }
        // return res;
        // }
        // });
        // System.out.println(list1);


        // Stack

        // Stack<Integer> stack = new Stack<>();

        // stack.push(1);
        // stack.push(5);
        // stack.push(1);
        // stack.push(7);
        // stack.push(3);
        // stack.push(9);
        // stack.push(11);
        // stack.push(18);
        // stack.push(21);

        // System.out.println(stack);

        // System.out.println(stack.peek());
        // System.out.println(stack);

        // System.out.println(stack.pop());
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack.size());
        // System.out.println(stack.pop());
        // System.out.println(stack.size());

        // Queue

        // Queue<Integer> que = new LinkedList<>();
        // Queue<Integer> que = new ArrayDeque<>();

        // que.offer(2);
        // que.offer(5);
        // que.offer(7);
        // que.offer(1);
        // que.offer(8);

        // System.out.println(que);
        // System.out.println(que.peek());
        // System.out.println(que.poll());
        // System.out.println(que);


        // here some additional operation are available, and nothing difference between these
        Deque<Integer> que = new ArrayDeque<>();
        // Deque<Integer> que = new LinkedList<>();

        que.offer(2);
        que.offer(5);
        que.offer(7);
        que.offer(1);
        que.offer(8);

        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);
    }
}

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
