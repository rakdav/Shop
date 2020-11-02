package com.example.shop.Models;

public class Tovar {
    private int picture;
    private String name;
    private String desc;
    private double price;
    private int count;
    private String edizm;

    public Tovar(int picture, String name, String desc, double price, int count, String edizm) {
        this.picture = picture;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.count = count;
        this.edizm = edizm;
    }
    public Tovar(){

    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getEdizm() {
        return edizm;
    }

    public void setEdizm(String edizm) {
        this.edizm = edizm;
    }
}
