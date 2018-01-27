package book.linkedlist;

import java.util.Arrays;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/15 10:36
 * @desc 打印两个链表公共的部分
 **/
public class PrintCommonPart {
    public static void printCommonPart(Node head1, Node head2) {
        System.out.println("print common part: ");
        while (head1 != null && head2 != null) {
            if (head1.getValue() < head2.getValue()) {
                head1 = head1.getNext();
            } else if (head1.getValue() > head2.getValue()) {
                head2 = head2.getNext();
            } else {
                System.out.print(head1.getValue() + " ");
                head1 = head1.getNext();
                head2 = head2.getNext();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = Node.createList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Node head2 = Node.createList(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        printCommonPart(head1, head2);
    }
}
