package com.wangkang.design_patterns.单例模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 17:22 2019/5/31
 * @Modified By:
 */
public class TeacherStaticNested {
    private String name;
    private Integer age;
    private TeacherStaticNested() {}
    private TeacherStaticNested(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private static class TeacherHolder {
        private static final TeacherStaticNested YU_QIAN = new TeacherStaticNested("于谦",54);
    }
    public static final TeacherStaticNested getYuQian() {
        return TeacherHolder.YU_QIAN;
    }
}
