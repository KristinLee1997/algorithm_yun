package book.linkedlist;

import java.util.Arrays;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 11:12
 * @desc 删除链表中间结点
 **/
public class RemoveMidNode {
    public static Node removeMidNode(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        if (head.getNext().getNext() == null) {
            head = head.getNext();
        }
        Node pre = head;
        Node cur = head.getNext().getNext();
        while (cur.getNext() != null && cur.getNext().getNext() != null) {
            pre = pre.getNext();
            cur = cur.getNext().getNext();
        }
        pre.setNext(pre.getNext().getNext());
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.createList(Arrays.asList(1, 3, 5, 7, 9, 11));
        head = removeMidNode(head);
        Node.printList(head);
    }
}
