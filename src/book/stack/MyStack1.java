package book.stack;

import java.util.Stack;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 8:17
 * @desc 获取栈中最小元素 P1
 **/

/**
 * MyStack1 vs MyStavk2
 * MyStack1:占用空间比MyStack1多,push复杂,pop简单(我比较喜欢这种,虽然空间占用较多,但是比MyStack2快)
 * MyStack2:占用空间相对较少,push简单,pop复杂
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum < getmin()) {
            this.stackMin.push(newNum);
        } else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getmin() {
        if (this.stackMin.empty()) {
            throw new RuntimeException("the stack is empty");
        }
        return this.stackMin.peek();
    }
}

class MyStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= getmin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }
        int value = this.stackData.pop();
        if (value == getmin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }
        return this.stackMin.peek();
    }
}
