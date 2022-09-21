package com.camel.design.demo.最为推荐的单例实现_枚举;

/**
 * @Title: SingtonEnums
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/21 0021 11:27
 * @Version: 1.0
 */
public enum SingtonEnums {

    instance;

    public void test(){
        System.out.println("枚举单例");
    }

    public static void main(String[] args) {
        SingtonEnums.instance.test();
    }
}
