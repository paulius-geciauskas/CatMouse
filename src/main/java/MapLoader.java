import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Admin on 2018-12-05.
 */
public class MapLoader {
    public MapPoint[][] LoadMap(){

  //  MapPoint [][] m2 = new MapPoint[4][4];
 //  m2 [0][0].p2 = PointType.K;
   ///////////////////////////////////
        MapPoint [][] m = new MapPoint [][]

        {
                {new MapPoint("P"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E")},
                {new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("E"), new MapPoint("K")},
        };



        return m;
    }

}

