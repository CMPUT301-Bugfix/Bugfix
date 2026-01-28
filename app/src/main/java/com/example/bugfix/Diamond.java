package com.example.bugfix;

public class Diamond extends Shape {
    private int d1;
    private int d2;


    public Diamond (int x, int y, int d1, int d2){
        this.x = x;
        this.y = y;
        this.d1 = d1;
        this.d2 = d2;

    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }
}
