package book.linkedlist;

import java.util.Arrays;
import java.util.List;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/5 8:14
 * @desc 单链表的选择排序
 **/
public class SelectionSort {
    public static Node selectionSort(Node head) {
        Node tail = null;
        Node cur = head;
        Node small = null;
        Node smallPre = null;
        while (cur != null) {
            small = cur;
            smallPre = getsmallestPreNode(cur);
            if (smallPre != null) {
                small = smallPre.next;
                smallPre.next = small.next;
            }
            cur = cur == small ? cur = cur.next : cur;
            if (tail == null) {
                head = small;
            } else {
                tail.next = small;
            }
            tail = small;
        }
        return head;
    }

    public static Node getsmallestPreNode(Node head) {
        Node smallPre = null;
        Node small = head;
        Node pre = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.value < small.value) {
                smallPre = pre;
                small = cur;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return smallPre;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(2, 5, 3, 7, 1, 4);
        Node head = Node.createList(data);
        head = selectionSort(head);
        Node.printList(head);
    }
}
