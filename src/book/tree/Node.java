package book.tree;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/2/5 8:48
 * @desc
 **/
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int data) {
        this.value = data;
    }

    public static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.value);
            inOrder(node.right);
        }
    }
}
