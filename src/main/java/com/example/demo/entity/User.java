package com.example.demo.entity;

public class User {
    private int id;
    private String name;
    private String age;
    private String adcd;

    public User() {
    }

    public User(int id, String name, String age, String adcd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adcd = adcd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdcd() {
        return adcd;
    }

    public void setAdcd(String adcd) {
        this.adcd = adcd;
    }
}
