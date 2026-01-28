package com.example.bugfix;

public class Triangle extends Shape{

    private int base;
    private int height;


    public Triangle (int x, int y, int base, int height){
        this.x = x;
        this.y = y;
        this.base = height;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
