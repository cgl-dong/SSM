package com.example.bootleaf;

public class Userss {
    private String name;
    private String age;
    private String sex;
    private String work;

    @Override
    public String toString() {
        return "Userss{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", work='" + work + '\'' +
                '}';
    }

    public Userss(String name, String age, String sex, String work) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
