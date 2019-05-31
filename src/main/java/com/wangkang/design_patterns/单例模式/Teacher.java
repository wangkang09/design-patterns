package com.wangkang.design_patterns.单例模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 16:27 2019/5/31
 * @Modified By:
 */
public class Teacher {
    private String name;
    private Integer age;
    private Teacher() {}

    private Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    private static Teacher YU_QIAN = new Teacher("于谦",54);
    public static Teacher getYuQian() {
        return YU_QIAN;
    }
}
