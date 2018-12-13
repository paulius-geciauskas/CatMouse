package com.paulius.comp.games.catmouse;

import com.paulius.comp.games.catmouse.model.Coordinate;
import com.paulius.comp.games.catmouse.model.KeyInput;
import com.paulius.comp.games.catmouse.model.MazeMap;
import com.paulius.comp.games.catmouse.output.ConsoleOutput;
import com.paulius.comp.games.catmouse.data.MapLoader;

/**
 * Created by Admin on 2018-12-06.
 * <p>
 * 1 versija, pele eina tik i desine
 */
public class Game {
    private MazeMap currentMap;

    void startGame(MazeMap currentMap) {
        this.currentMap = currentMap;
    }

    void playerInput(KeyInput playerInput) {

        if (KeyInput.DOWN.equals( playerInput)) {

           Coordinate coor = currentMap.catCoord();
           coor.setY(coor.getY() + 1);

            currentMap.mouseMove(coor);

        }

        if (KeyInput.UP.equals( playerInput)) {

            Coordinate coor = currentMap.catCoord();
            coor.setY(coor.getY() - 1);

            currentMap.mouseMove(coor);

        }
        if (KeyInput.RIGHT.equals( playerInput)) {

            Coordinate coor = currentMap.catCoord();
            coor.setX(coor.getX() + 1);

            currentMap.mouseMove(coor);

        }
        if (KeyInput.LEFT.equals( playerInput)) {

            Coordinate coor = currentMap.catCoord();
            coor.setX(coor.getX() - 1);

            currentMap.mouseMove(coor);

        }

    }

    void catMove() {

    }
}
