package Week7;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(35);
        linkedList.add(45);
        linkedList.add(56);
        linkedList.add(100);
        linkedList.add(2,566);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList.contains(56));
        System.out.println(linkedList.get(1));
    }
}
