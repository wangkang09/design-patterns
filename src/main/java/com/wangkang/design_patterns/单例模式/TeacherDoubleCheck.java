package com.wangkang.design_patterns.单例模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 16:52 2019/5/31
 * @Modified By:
 */
public class TeacherDoubleCheck {
    private String name;
    private Integer age;
    private TeacherDoubleCheck() {}
    private TeacherDoubleCheck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    private volatile static TeacherDoubleCheck YU_QIAN;
    public static TeacherDoubleCheck getTeacher() {
        if (YU_QIAN == null) {                         //Single Checked
            synchronized (Teacher.class) {
                if (YU_QIAN == null) {                 //Double Checked
                    YU_QIAN = new TeacherDoubleCheck("于谦",54);
                }
            }
        }
        return YU_QIAN ;
    }
}
