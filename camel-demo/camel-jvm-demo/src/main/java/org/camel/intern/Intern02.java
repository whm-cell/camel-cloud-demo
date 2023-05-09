package org.camel.intern;

/**
 * @author M
 */
public class Intern02 {

    public static void main(String[] args) {
        // 会在字符串常量池创建1 并在stringTable中创建kv对
        String s  = new String("1");

        // 这种已经在字符串常量池创建了值后的s对象 ，再次调用intern就没有用了 。  并且这里是没有经过赋值的
        s.intern();

        // 会直接指向到s对象创建的kv 对上，
        String s2 = "1";

        // 如果调用s.intern == s2 这是为true
        System.out.println(s.intern() == s2);  // true
        // 反之  s会在堆空间创建一个对象 ，该地址和s2所获取到的kv中的v的地址是不同的
        System.out.println(s == s2); // false
    }


}
