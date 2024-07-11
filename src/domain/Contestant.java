package domain;

import java.io.Serializable;

public class Contestant implements Serializable{
    private  static final  long serialVersionUID = 1L;

    private String name;
    private  String surname;

    private int age;
    private String username;

    public Contestant() {
    }

    public Contestant(String name, String surname, int age, String username) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
