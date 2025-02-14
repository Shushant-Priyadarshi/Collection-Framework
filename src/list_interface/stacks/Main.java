package list_interface.stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Integer removedElement = stack.pop();
        Integer topElement = stack.peek();

        stack.add(0,0);
        System.out.println("Size: "+ stack.size());
        System.out.println("Stack: " + stack);

        int searched = stack.search(2);// 1 based indexing
        System.out.println("Searched: " + searched);

        // we can also use Linkedlist to implement stack

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        linkedList.removeLast(); // pop
        linkedList.getLast(); //peek


    }
}
