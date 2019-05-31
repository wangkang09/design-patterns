package com.wangkang.design_patterns.Prototype模式;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:34 2019/5/31
 * @Modified By:
 */
public class StudentResumeFactory extends ResumePrototypeFactory {
    private static final List<WorkExperience> wks = Arrays.asList(new WorkExperience("1-2","nanjing"),new WorkExperience("2-3","beijing"));
    public static final Resume prototype = new Resume("wk","男","22",wks);
    @Override
    public Resume createResume() throws CloneNotSupportedException {
        return (Resume) prototype.clone();
    }
}
