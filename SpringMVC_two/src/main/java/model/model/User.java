package model.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class User {
    private String username;
    private String password;
    private Integer age;
    public Aderess aderess;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", aderess.country=" + aderess.getCountry() +'\''+",aderess.city="+aderess.getCity()+
                '}';
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Aderess getAderess() {
        return aderess;
    }

    public void setAderess(Aderess aderess) {
        this.aderess = aderess;
    }
}