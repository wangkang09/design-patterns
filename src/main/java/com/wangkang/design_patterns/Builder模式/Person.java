package com.wangkang.design_patterns.Builder模式;

/**
 * @Description:
 * @Author: wangkang
 * @Date: Created in 11:53 2019/5/29
 * @Modified By:
 */
public class Person {
    private String head;
    private String body;
    private String armLeft;
    private String armRight;
    private String legLeft;
    private String legRight;

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", armLeft='" + armLeft + '\'' +
                ", armRight='" + armRight + '\'' +
                ", legLeft='" + legLeft + '\'' +
                ", legRight='" + legRight + '\'' +
                '}';
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getArmLeft() {
        return armLeft;
    }

    public void setArmLeft(String armLeft) {
        this.armLeft = armLeft;
    }

    public String getArmRight() {
        return armRight;
    }

    public void setArmRight(String armRight) {
        this.armRight = armRight;
    }

    public String getLegLeft() {
        return legLeft;
    }

    public void setLegLeft(String legLeft) {
        this.legLeft = legLeft;
    }

    public String getLegRight() {
        return legRight;
    }

    public void setLegRight(String legRight) {
        this.legRight = legRight;
    }
}
