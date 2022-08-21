package com.example.recycleviewexample_3;

import java.io.Serializable;

public class Member implements Serializable {
    private String name, text;

    public Member(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Name = " + name  + ",  Text = " + text;
    }
}
