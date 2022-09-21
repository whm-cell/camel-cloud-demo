package com.camel.design.demo.新建一个和品牌有关的抽象类;

import com.camel.design.demo.Mi;
import com.camel.design.demo.新建一个和品牌有关的抽象类.MiPhone;
import com.camel.design.demo.新建一个和品牌有关的抽象类.Phone;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Phone phone = new MiPhone(new Mi());
        phone.open_自定义方法去使用品牌的具体实现();
    }
}
