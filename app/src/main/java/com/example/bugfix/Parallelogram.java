package com.example.bugfix;

public class Parallelogram extends Shape {
    private float angle;
    private int[] sides = new int[2];

    public Parallelogram(int x, int y, int side1, int side2, float angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.sides[0] = side1;
        this.sides[1] = side2;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getSide(int num) {
        if (num > 1) {
            throw new ArrayIndexOutOfBoundsException("0 indexed with only 0 or 1 valid");
        }
        return sides[num];
    }

    public void setSide(int num, int length) {
        if (num > 1) {
            throw new ArrayIndexOutOfBoundsException("0 indexed with only 0 or 1 valid");
        }
        this.sides[num] = length;
    }
}
