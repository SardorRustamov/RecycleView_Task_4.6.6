package com.example.recycleviewexample_3;

public class Item {
    String title, description;
    int image;

    public Item(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
