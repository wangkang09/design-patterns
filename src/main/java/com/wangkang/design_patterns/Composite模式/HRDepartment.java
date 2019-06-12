package com.wangkang.design_patterns.Composite模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:22 2019/6/12
 * @Modified By:
 */
public class HRDepartment extends AbstractCompany {
    public HRDepartment(String name) {
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
        System.out.println(name + "：员工招聘培训管理");
    }
}
