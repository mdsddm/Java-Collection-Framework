package List;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;

/*  1.) "Copy on Write" means that whenever a write operation
    2.) like adding or removing an element
    3.) instead of directly modifying the existing list
    4.) a new copy of the list is created, and the modification is applied to that copy
    5.)  This ensures that other threads reading the list while it's being modified are unaffected.
    6.) Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
    7.) Write Operations: A new copy of the list is created for every modification.
    The reference to the list is then updated so that subsequent reads use this new list. 
    8.) Useful on : When more read and less Write   */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
        ArrayList<String> arrlist = new ArrayList<>();
        cowal.add("milk");
        arrlist.add("milk");
        cowal.add("buttor");
        arrlist.add("buttor");
        cowal.add("bread");
        arrlist.add("bread");

        // As You can see in ArrayList while reading we can not write it, it gives
        // ConcurrentModificationException
        try {
            for (String element : arrlist) {
                System.out.print(element + " ");
                if (element.equals("buttor")) {
                    arrlist.add("egg");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("\nException :" + e);
        }

        // whereas in CopyOnWriteArrayList we can write while reading because it write
        // on the copy list not original self
        for (String element : cowal) {
            System.out.print(element + " ");
            if (element.equals("buttor")) {
                cowal.add("egg");
            }
        }

        System.out.println("\nupdated : " + arrlist);

        System.out.println(cowal);
    }
}