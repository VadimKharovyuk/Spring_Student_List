package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
    private Long id; // ID
    private String first; // Имя
    private String last; // Фамилия
    private String num; // номер студенческого
    private float av; // средний балл

    protected Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getAv() {return av;}

    public void setAv(float av) {this.av = av;}


    @Override
    public String toString() {
        return "student [id=" + id + ", first=" + first +", last=" + last + ", num=" + num + ", av=" + av + "]";
    }
}
