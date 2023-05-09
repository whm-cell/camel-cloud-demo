package org.camel.intern;

/**
 * @author M
 */
public class Intern03 {

    public static void main(String[] args) {
        // 会在字符串常量池创建1 并在stringTable中创建kv对
        String s  = new String("1");
        String s2 = "1";

        s.intern();

        System.out.println(s == s2);


        String s3 = new String("1") +new String("1");

        String s4 = "11"; //
        s3.intern();// 如果找不到才会创建 ，如果有直接返回，所以这里直接返回了s4的内存地址 。  但是没有接收，这里没有任何意义

        System.out.println(s3 == s4); // false


    }


}
