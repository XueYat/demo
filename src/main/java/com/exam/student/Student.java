package com.exam.student;

/**
 * @author YatXue
 * @date 2019/4/26 15:02
 */
public class Student {
    private int stuId;
    private String stuName;
    private int stuAge;
    private String stuPhone;
    private String stuAddress;

    public Student(int stuId, String stuName, int stuAge, String stuPhone, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuPhone = stuPhone;
        this.stuAddress = stuAddress;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}
