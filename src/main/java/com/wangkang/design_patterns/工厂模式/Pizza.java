package com.wangkang.design_patterns.工厂模式;

/**
 * @Description: 实现类有 CheesePizza,GreekPizza
 * @Author: wangkang
 * @Date: Created in 22:18 2019/5/24
 * @Modified By:
 */
public abstract class Pizza {
    String name;
    Integer size;

    public Pizza(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public Pizza() {
    }

    void prepare() {
        System.out.println("开始准备："+ size + " 寸的 " + name + " 披萨...");
    }
    void bake() {
        System.out.println("烘烤...");
    }
    void cut() {
        System.out.println("切片...");
    }
    void done() {
        System.out.println("准备好啦!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
