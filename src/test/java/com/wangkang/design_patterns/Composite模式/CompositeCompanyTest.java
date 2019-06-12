package com.wangkang.design_patterns.Composite模式;


import org.junit.Test;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:25 2019/6/12
 * @Modified By:
 */
public class CompositeCompanyTest {
    @Test
    public void test() {
        CompositeCompany root = new CompositeCompany("南京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        CompositeCompany comp0 = new CompositeCompany("深圳分公司");
        comp0.add(new HRDepartment("深圳分公司人力资源部"));
        comp0.add(new FinanceDepartment("深圳分公司财务部"));
        root.add(comp0);

        CompositeCompany comp1 = new CompositeCompany("美国办事处");
        comp1.add(new HRDepartment("深圳分公司人力资源部"));
        comp1.add(new FinanceDepartment("深圳分公司财务部"));
        comp0.add(comp1);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责图：");
        root.LineOfDuty();

    }

}