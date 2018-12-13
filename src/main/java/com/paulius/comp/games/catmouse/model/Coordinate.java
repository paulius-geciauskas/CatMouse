package com.paulius.comp.games.catmouse.model;

/**
 * Created by Admin on 2018-12-11.
 */
public class Coordinate {
    private int x, y;
    Coordinate parent;

    public Coordinate(int x, int y, Coordinate parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    public Coordinate getParent() {
        return parent;
    }

    public int getX() {
        return x;
    }



    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
