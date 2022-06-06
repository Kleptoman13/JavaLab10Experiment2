package com.example.javalab10experiment2;

import java.util.ArrayList;

public class Users {
    public ArrayList<User> list;

    public Users()
    {
        list = new ArrayList<>();
    }

    public void add(int x1)
    {
        this.list.add(new User(x1));
    }

    public ArrayList getUsers()
    {
        return this.list;
    }

    public String toString() {
        String result =this.list + System.lineSeparator();
        return result;
    }
}
