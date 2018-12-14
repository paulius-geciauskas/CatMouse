/**
 * Created by Admin on 2018-12-14.
 */

import static com.paulius.comp.games.catmouse.model.PointType.*;
import static org.junit.Assert.assertTrue;

import com.paulius.comp.games.catmouse.data.MapLoader;

import com.paulius.comp.games.catmouse.model.MapPoint;
import com.paulius.comp.games.catmouse.model.MazeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CatMoveTest {
    @Before
    public void init() {
        MapPoint[][] m = new MapPoint[][]{
                {new MapPoint(MOUSE, 0, 0), new MapPoint(EMPTY, 1, 0), new MapPoint(EMPTY, 2, 0), new MapPoint(EMPTY, 3, 0), new MapPoint(EMPTY, 4, 0)},
                {new MapPoint(EMPTY, 0, 1), new MapPoint(EMPTY, 1, 1), new MapPoint(EMPTY, 2, 1), new MapPoint(EMPTY, 3, 1), new MapPoint(EMPTY, 4, 1)},
                {new MapPoint(EMPTY, 0, 2), new MapPoint(EMPTY, 1, 2), new MapPoint(WALL, 2, 2), new MapPoint(EMPTY, 3, 2), new MapPoint(EMPTY, 4, 2)},
                {new MapPoint(EMPTY, 0, 3), new MapPoint(WALL, 1, 3), new MapPoint(CAT, 2, 3), new MapPoint(EMPTY, 3, 3), new MapPoint(EMPTY, 4, 3)},
                {new MapPoint(EMPTY, 0, 4), new MapPoint(WALL, 1, 4), new MapPoint(EMPTY, 2, 4), new MapPoint(EMPTY, 3, 4), new MapPoint(EMPTY, 4, 4)},
        };


    }

    @Test
    public void successCases0() {
        MapPoint[][] m = new MapPoint[][]{
                {new MapPoint(MOUSE, 0, 0), new MapPoint(EMPTY, 1, 0), new MapPoint(EMPTY, 2, 0), new MapPoint(EMPTY, 3, 0), new MapPoint(EMPTY, 4, 0)},
                {new MapPoint(EMPTY, 0, 1), new MapPoint(EMPTY, 1, 1), new MapPoint(EMPTY, 2, 1), new MapPoint(EMPTY, 3, 1), new MapPoint(EMPTY, 4, 1)},
                {new MapPoint(EMPTY, 0, 2), new MapPoint(EMPTY, 1, 2), new MapPoint(WALL, 2, 2), new MapPoint(EMPTY, 3, 2), new MapPoint(EMPTY, 4, 2)},
                {new MapPoint(EMPTY, 0, 3), new MapPoint(WALL, 1, 3), new MapPoint(CAT, 2, 3), new MapPoint(EMPTY, 3, 3), new MapPoint(EMPTY, 4, 3)},
                {new MapPoint(EMPTY, 0, 4), new MapPoint(WALL, 1, 4), new MapPoint(EMPTY, 2, 4), new MapPoint(EMPTY, 3, 4), new MapPoint(EMPTY, 4, 4)},
        };
      //  Assert.assertEquals(new MapPoint(EMPTY, 3, 3), MazeMap.calcNextCatMove(m));
    }



}

