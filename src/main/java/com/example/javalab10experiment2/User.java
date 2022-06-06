package com.example.javalab10experiment2;

public class User {
    private int x1;

    public User(int x1) {
        this.x1 = x1;
    }

    public int getX1() {
        return this.x1;
    }

    @Override
    public String toString() {
        return  getX1() + System.lineSeparator();
    }

}
