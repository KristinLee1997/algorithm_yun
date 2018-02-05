package book.tree;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/5 8:48
 * @desc 通过有序数组生成平衡二叉树
 **/
public class GenerateTree {
    public static Node generateTree(int[] sortArr) {
        if (sortArr == null) {
            return null;
        }
        return generate(sortArr, 0, sortArr.length - 1);
    }

    public static Node generate(int[] sortArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start & end) + (start ^ end) / 2;
        Node head = new Node(sortArr[mid]);
        head.left = generate(sortArr, start, mid - 1);
        head.right = generate(sortArr, mid + 1, end);
        return head;
    }

    public static void main(String[] args) {
        Node head = generateTree(new int[]{1, 2, 4, 5, 7, 8, 9});
        Node.inOrder(head);
    }
}
