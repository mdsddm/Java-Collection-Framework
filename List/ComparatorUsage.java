package List;

import java.util.*;

/*  This code first compare String length, if length is eaual then it will compare string alphabetically 
 */
public class ComparatorUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("dog");
        list.add("banana");
        list.add("cat");
        System.out.println(list);
        list.sort(new StringComparator());
        System.out.println(list);
    }

}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return s1.compareTo(s2);
        }
        return Integer.compare(s1.length(), s2.length());
    }
}