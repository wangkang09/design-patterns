package com.wangkang.design_patterns.Prototype模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 10:52 2019/5/30
 * @Modified By:
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private List<WorkExperience> wks;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume o = (Resume) super.clone();
        o.wks = new ArrayList<>(wks.size());
        for (int i = 0,iMax = wks.size(); i < iMax; i++) {
            o.wks.add((WorkExperience) wks.get(i).clone());
        }
        return o;
    }

    public Resume(String name, String sex, String age, List<WorkExperience> wks) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.wks = wks;
    }

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", wks=" + wks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<WorkExperience> getWks() {
        return wks;
    }

    public void setWks(List<WorkExperience> wks) {
        this.wks = wks;
    }

    public void addWks(WorkExperience wk) {
        this.wks.add(wk);
    }
}
