package com.kristin.first.chapter1;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/28 15:37
 * @desc 交换两个数: 不开辟空间,使用异或原则 自己与自己异或还是本身 a=a^a b=b^b
 **/
public class SwapWithOutSpace {
    public static void swap() {
        int a = 7;
        int b = 8;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        swap();
    }
}
