package List;

import java.util.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // adding 10 numbers
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        // index wise
        list.remove(1);
        System.out.println(list);
        // object wise
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        // conditional remove
        list.removeIf(o -> o % 2 == 1);
        System.out.println(list);
    }
}
