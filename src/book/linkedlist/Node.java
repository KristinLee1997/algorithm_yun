package book.linkedlist;

import java.util.List;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 8:42
 * @desc
 **/
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static Node createList(List<Integer> data) {
        if (data.isEmpty()) {
            return null;
        }
        Node firstNode = new Node(data.get(0));
        Node subList = createList(data.subList(1, data.size()));
        firstNode.setNext(subList);
        return firstNode;
    }

    public static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.getValue() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }

}
