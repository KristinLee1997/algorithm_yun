package book.stack;

import java.util.Stack;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 9:30
 * @desc 使用递归函数和栈操作逆序一个栈
 **/
public class ReverseStack {
    public int getAndremoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        } else {
            int last = getAndremoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int i = getAndremoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
