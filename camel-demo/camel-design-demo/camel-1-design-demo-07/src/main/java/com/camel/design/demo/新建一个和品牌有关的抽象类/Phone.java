package com.camel.design.demo.新建一个和品牌有关的抽象类;

import com.camel.design.demo.Brand;

public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    /**
     * 设置一个抽象方法，让子类去实现
     */
    public void open_自定义方法去使用品牌的具体实现(){
        brand.getBrand();
    };
}


class MiPhone extends Phone{

    public MiPhone(Brand brand) {
        super(brand);
        System.out.println("MiPhone 继承父类的构造函数");
    }

    @Override
    public void open_自定义方法去使用品牌的具体实现() {
        super.open_自定义方法去使用品牌的具体实现();
        System.out.println("这里书写关于小米手机的自定义逻辑");
    }

}


class Iphone6s extends Phone{

    public Iphone6s(Brand brand) {
        super(brand);
        System.out.println("Iphone6s 继承父类的构造函数");
    }

    @Override
    public void open_自定义方法去使用品牌的具体实现() {
        super.open_自定义方法去使用品牌的具体实现();
    }
}

