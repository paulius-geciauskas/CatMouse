package com.paulius.comp.games.catmouse.data;

import com.paulius.comp.games.catmouse.model.MapPoint;


/**
 * Created by Admin on 2018-12-05.
 */
public class MapLoader {
    public MapPoint[][] loadMap(){

  //  com.paulius.comp.games.catmouse.model.MapPoint [][] m2 = new com.paulius.comp.games.catmouse.model.MapPoint[4][4];
 //  m2 [0][0].p2 = com.paulius.comp.games.catmouse.model.PointType.CAT;
   ///////////////////////////////////
        MapPoint [][] m = new MapPoint [][]

        {
                {new MapPoint("MOUSE"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("CAT")},
        };



        return m;
    }

}

