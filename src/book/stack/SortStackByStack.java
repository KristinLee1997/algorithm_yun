package book.stack;

import java.util.Stack;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 10:48
 * @desc 使用两个栈对元素进行排序, 从栈顶到栈底, 从大到小
 **/
public class SortStackByStack {
    public void sort(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
