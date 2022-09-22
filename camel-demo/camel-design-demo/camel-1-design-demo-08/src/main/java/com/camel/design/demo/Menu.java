package com.camel.design.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Menu
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 13:40
 * @Version: 1.0
 */
public class Menu extends a_最终被使用抽象类{
    private String name;
    private List<a_最终被使用抽象类> list = new ArrayList<>();

    private Integer level;

    public Menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(a_最终被使用抽象类 a) {
        list.add(a);
    }

    @Override
    public void remove(a_最终被使用抽象类 a) {
        list.remove(a);
    }

    @Override
    public void print() {
        System.out.println("目录名称："+this.name);
        for (a_最终被使用抽象类 a : list) {
            if(this.level!=null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("   ");
                }
            }
            a.print();
        }
    }

}
