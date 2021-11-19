package com;

public class User {
    private int id;
    private String name;
    private  Order o;

    public User(int id, String name,Order o) {
        this.o=o;
        this.id = id;
        this.name = name;
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

    public Order getO() {
        return o;
    }

    public void setO(Order o) {
        this.o = o;
    }
}
