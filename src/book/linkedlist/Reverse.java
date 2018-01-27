package book.linkedlist;

import java.util.Arrays;
import java.util.List;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 8:42
 * @desc 反转单向链表
 **/
public class Reverse {
    public static Node reverse(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
        Node head = Node.createList(data);
        Node.printList(head);
        head = reverse(head);
        Node.printList(head);
    }
}
