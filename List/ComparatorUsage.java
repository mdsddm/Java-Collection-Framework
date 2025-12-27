package List;

import java.util.*;

/*  This code first compare String length, if length is eaual then it will compare string alphabetically

 */
public class ComparatorUsage {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("dog");
        list1.add("banana");
        list1.add("cat");
        System.out.println(list1);
        // using compare method
        list1.sort(new StringComparator());
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("dog");
        list2.add("banana");
        list2.add("cat");
        System.out.println(list2);
        // Using lambda expression
        list2.sort((a, b) -> {
            if (a.length() > b.length()) {
                return 1;
            } else if (a.length() < b.length()) {
                return -1;
            } else {
                return a.compareTo(b);
            }
        });
        System.out.println(list2);
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("alice", 8.65));
        list3.add(new Student("bob", 7.65));
        list3.add(new Student("catain", 8.65));
        list3.add(new Student("millie", 8.99));
        Comparator<Student> comparator = Comparator.comparing(Student::getGPA)
                .reversed()
                .thenComparing(Student::getName);

        System.out.println(list3);

        list3.sort(comparator);
        System.out.println(list3);

    }

}

class Student {
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return "(" + name + " " + gpa + ")";
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
