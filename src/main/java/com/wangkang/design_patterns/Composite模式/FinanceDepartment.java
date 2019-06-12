package com.wangkang.design_patterns.Composite模式;

/**
 * @Description: 叶节点
 * @Author: wangkang
 * @Date: Created in 11:23 2019/6/12
 * @Modified By:
 */
public class FinanceDepartment extends AbstractCompany {
    public FinanceDepartment(String name) {
        super(name);
    }

    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
    }
    public void LineOfDuty() {
        System.out.println(name + "：公司财务收支管理");
    }
}
