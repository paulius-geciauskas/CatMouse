package com.paulius.comp.games.catmouse.model;

/**
 * Created by Admin on 2018-12-06.
 */
public class MapPoint {


    int x;
    int y;
    private PointType p;

    //Konstruktorius
    public MapPoint(PointType p, int x, int y) {
        this.x = x;
        this.y = y;
        this.p = p;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setP(PointType p) {
        this.p = p;
    }


    public PointType getP() {
        return p;
    }
}


