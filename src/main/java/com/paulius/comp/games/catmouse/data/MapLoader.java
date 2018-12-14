package com.paulius.comp.games.catmouse.data;
import com.paulius.comp.games.catmouse.model.MapPoint;
import com.paulius.comp.games.catmouse.model.PointType;
import static com.paulius.comp.games.catmouse.model.PointType.EMPTY;
import static com.paulius.comp.games.catmouse.model.PointType.MOUSE;
/**
 * Created by Admin on 2018-12-05.
 */
public class MapLoader {
    public MapPoint[][] loadMap(){


        MapPoint [][] m = new MapPoint [][]

        {
                {new MapPoint(MOUSE, 0,0), new MapPoint(EMPTY, 1,0), new MapPoint(EMPTY, 2,0), new MapPoint(EMPTY, 3,0), new MapPoint(EMPTY, 4,0)},
                {new MapPoint(EMPTY, 0,1), new MapPoint(EMPTY, 1,1), new MapPoint(EMPTY, 2,1), new MapPoint(EMPTY, 3,1), new MapPoint(EMPTY, 4,1)},
                {new MapPoint(EMPTY, 0,2), new MapPoint(EMPTY, 1,2), new MapPoint(EMPTY, 2,2), new MapPoint(EMPTY, 3,2), new MapPoint(EMPTY, 4,2)},
                {new MapPoint(EMPTY, 0,3), new MapPoint(EMPTY, 1,3), new MapPoint(EMPTY, 2,3), new MapPoint(EMPTY, 3,3), new MapPoint(EMPTY, 4,3)},
                {new MapPoint(EMPTY, 0,4), new MapPoint(EMPTY, 1,4), new MapPoint(EMPTY, 2,4), new MapPoint(EMPTY, 3,4), new MapPoint(EMPTY, 4,4)},
        };



        return m;
    }

}

