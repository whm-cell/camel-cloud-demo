package com.camel.design.demo;

/**
 * @Title: Test
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 13:51
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {

        a_最终被使用抽象类 menu = new Menu("根目录",1);
        a_最终被使用抽象类 menu1 = new Menu("第一级目录",2);


        a_最终被使用抽象类 course = new Course("java", 100);

        a_最终被使用抽象类 course1 = new Course("java1", 100);

        a_最终被使用抽象类 course2 = new Course("java2", 100);

        menu.add(course);
        menu.add(course1);

        menu1.add(course2);
        menu.add(menu1);

        menu.print();

    }
}
