package org.jzp.model;

/**
 * @author Hongyi Zheng
 * @date 2018/8/9
 */
public enum Gender {
    //男
    male("MALE","blue"),
    //女
    female("FEMALE","pink"),
    //保密
    secret("UNKNOWN","grey");

    //性别
    private String name;
    //图标颜色
    private String color;

    Gender(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
