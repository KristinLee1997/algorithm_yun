package book.linkedlist;

import java.util.Arrays;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 11:25
 * @desc
 **/
public class RemoveByRatio {
    public static Node removeByRatio(Node head, int a, int b) {
        if (head == null || a < 1 || a > b) {
            return head;
        }
        int n = 0;
        Node cur = head;
        while (cur != null) {
            n++;
            cur = cur.getNext();
        }
        n = (int) Math.ceil(((double) (a * n)) / (double) b);
        if (n == 1) {
            head = head.getNext();
        }
        if (n > 1) {
            cur = head;
            while (n != 1) {
                n--;
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.createList(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        head = removeByRatio(head, 5, 7);
        Node.printList(head);
    }
}
