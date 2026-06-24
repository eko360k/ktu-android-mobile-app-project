package com.example.healthysoul;

public class Contact {

    private String name;
    private String message;
    private String time;
    private int image;

    public Contact(String name,
                   String message,
                   String time,
                   int image) {

        this.name = name;
        this.message = message;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public int getImage() {
        return image;
    }
}