package com.wangkang.design_patterns.Composite模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 组合元素
 * @Author: wangkang
 * @Date: Created in 11:07 2019/6/12
 * @Modified By:
 */
public class CompositeCompany extends AbstractCompany {
    public CompositeCompany(String name) {
        super(name);
    }
    private List<AbstractCompany> children = new ArrayList<>();

    public  boolean add(AbstractCompany company) {
        return children.add(company);
    }
    public boolean remove(AbstractCompany company) {
        return children.remove(company);
    }
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
        //递归调用子节点
        for (AbstractCompany child : children) {
            child.display(depth + 2);
        }
    }
    public void LineOfDuty() {
        for (AbstractCompany child : children) {
            child.LineOfDuty();
        }
    }
}
