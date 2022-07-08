package com.example.demo.student;

import lombok.Data;

@Data
public class student{
    private String name;
    private int age;
    private int id;
    private int score;
}

class Person {
    private int id;
    private int age;
    private String name;
    public Person() {
    }
}

class Base1 {
    private int v1;
    private int v2;
    public Base1(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    public Base1(int v1) {
        this.v1 = v1;
    }
}

class Base2 extends Base1 {
    private int v3;
    private int v4;
    public Base2(int v1, int v2, int v3, int v4) {
        super(v1, v2);
        this.v3 = v3;
        this.v4 = v4;
    }
}