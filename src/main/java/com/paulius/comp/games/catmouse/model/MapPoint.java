package com.paulius.comp.games.catmouse.model;

/**
 * Created by Admin on 2018-12-06.
 */
public class MapPoint  {

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    //  private boolean WALL;
    private boolean check = true;

    private PointType p ;

    public void setP(PointType p) {
        this.p = p;
    }

    //Konstruktorius
    public MapPoint(String P){

        this.p=PointType.valueOf(P);

    }


    public PointType getP() {
        return p;
    }
}


