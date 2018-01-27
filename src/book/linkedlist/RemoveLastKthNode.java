package book.linkedlist;

import java.util.Arrays;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 10:48
 * @desc 删除链表中倒数第k个元素
 **/
public class RemoveLastKthNode {
    public static Node removeLastKthNode(Node head, int lastKth) {
        if (head == null || lastKth < 1) {
            return head;
        }
        Node cur = head;
        while (cur != null) {
            lastKth--;
            cur = cur.getNext();
        }
        if (lastKth == 0) {
            head = head.getNext();
        }
        if (lastKth < 0) {
            cur = head;
            while (++lastKth != 0) {
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.createList(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        Node newhead = removeLastKthNode(head, 3);
        Node.printList(newhead);
    }
}
