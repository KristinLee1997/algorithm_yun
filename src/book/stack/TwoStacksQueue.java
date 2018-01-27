package book.stack;

import java.util.Stack;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 9:01
 * @desc
 **/
public class TwoStacksQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStacksQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int pushInt) {
        this.stackPush.push(pushInt);
    }

    public int pop() {
        if (this.stackPush.empty() && this.stackPop.empty()) {
            throw new RuntimeException("the stack are empty");
        } else if (this.stackPop.empty()) {
            while (!this.stackPush.empty()) {
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return this.stackPop.pop();
    }

    public int peek() {
        if (this.stackPush.empty() && this.stackPop.empty()) {
            throw new RuntimeException("the stack are empty");
        } else if (this.stackPop.empty()) {
            while (!this.stackPush.empty()) {
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return this.stackPop.peek();
    }
}
