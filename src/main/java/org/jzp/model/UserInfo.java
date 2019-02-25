package org.jzp.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Hongyi Zheng
 * @date 2018/8/9
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -8007922872251166065L;
    //用户id
    private String uid;
    //真实姓名
    private String name;
    //昵称
    private String maskName;
    //性别
    private Gender gender;
    //用户名
    private String username;
    private String password;

    public UserInfo() {
    }

    public UserInfo(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public UserInfo(String name, String maskName, Gender gender, String username, String password) {
        this.name = name;
        this.maskName = maskName;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(name, userInfo.name) &&
                Objects.equals(maskName, userInfo.maskName) &&
                gender == userInfo.gender &&
                Objects.equals(username, userInfo.username) &&
                Objects.equals(password, userInfo.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, maskName, gender, username, password);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", maskName='" + maskName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
