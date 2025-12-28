package List;

import java.util.Stack;

/*LIFO Structure: Stack follows the Last-In-First-
Out (LIFO) principle, where the last element
added is the first one to be removed.

Inheritance: Stack is a subclass of Vector, which
means it inherits all the features of a dynamic
array but is constrained by the stack's LIFO
nature.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);

        System.out.println("pop : " + stack.pop());
        System.out.println(stack);
        System.out.println("pop : " + stack.pop());
        System.out.println(stack);
        System.out.println("pop : " + stack.pop());
        System.out.println(stack);
        System.out.println("pop : " + stack.pop());
        System.out.println(stack);
    }
}