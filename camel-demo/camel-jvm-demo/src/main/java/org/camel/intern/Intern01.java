package org.camel.intern;

/**
 * @author M
 */
public class Intern01 {

    public static void main(String[] args) {
        // 会在字符串常量池创建1 并在stringTable中创建kv对
        String s  = new String("1");
        //
        String s2 = "1";

        s.intern();

        System.out.println(s == s2); // false


        // 这个一共创建了五个对象
        // 会在字符串常量池里，生成一个1 并在stringTable中， 生成一个1 的kv键值对
        String s3 = new String("1") +new String("1");

        // s3.intern() // 根据要求会在字符串常量池的 stringTable中，生成一个全新的kv对，该v值是指向了s3的地址 。

        s3.intern();

        // 这个值按理说是  这个11不会再在在字符串常量池里再次生成11了 ，会先去stringTable里去找11这个值搜否存在，
        // 如果存在了则将该v的地址值返回到s4这个对象上
        String s4 = "11";

        System.out.println(s3 == s4);// 所以这里应该是true

    }


}
