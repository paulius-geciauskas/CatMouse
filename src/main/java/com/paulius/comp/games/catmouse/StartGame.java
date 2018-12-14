package com.paulius.comp.games.catmouse;

import com.paulius.comp.games.catmouse.data.MapLoader;
import com.paulius.comp.games.catmouse.model.KeyInput;
import com.paulius.comp.games.catmouse.model.MazeMap;

/**
 * Created by Admin on 2018-12-06.
 * <p>
 * v5
 */
public class StartGame {
    private MazeMap currentMap;
//private MapLoader load = new MapLoader();

    void startGame(MazeMap currentMap) {
        this.currentMap = currentMap;

    }


    void playerInput(KeyInput playerInput) {

        currentMap.mouseMove(playerInput);

    }


}
