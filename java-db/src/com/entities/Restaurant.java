package com.entities;

public class Restaurant {

    private int id;
    private String name;
    private boolean approved;

    public Restaurant(){

    }

    public Restaurant(String name, boolean approved){
        this.name = name;
        this.approved = approved;
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

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
