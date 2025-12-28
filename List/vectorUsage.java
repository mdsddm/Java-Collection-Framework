package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* Once size is full capacity will be doubled or you can add capacity increment capacity 
1. Vector is a legacy synchronized collection class that implements the List interface.
2. It behaves like a dynamic array and grows as needed.
3. It provides thread safety but with a performance cost in single-threaded environments.
4. In modern applications, ArrayList or concurrent alternatives like CopyOnWriteArrayList are typically preferred over Vector unless thread safety is a priority. */
public class vectorUsage {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("capacity :" + vector.capacity());
        vector.add(1);
        System.out.println("capacity :" + vector.capacity());
        List<Integer> list = new ArrayList<>();
        vector.clear();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                list.add(i);
                vector.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                list.add(i);
                vector.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of List : " + list.size());
        System.out.println("Size of Vector : " + vector.size());
    }
}