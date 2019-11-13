package cn.kgc.pojo;

import java.io.Serializable;

/**
 * @author YatXue
 * @date 2019/6/22 11:07
 */
public class User implements Serializable {
    private String userName;
    private String sex;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
