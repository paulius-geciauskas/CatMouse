package com.paulius.comp.games.catmouse;

import com.paulius.comp.games.catmouse.model.KeyInput;
import com.paulius.comp.games.catmouse.model.MazeMap;

/**
 * Created by Admin on 2018-12-06.
 *
 * v5
 */
public class Game {
    private MazeMap currentMap;

    void startGame(MazeMap currentMap) {
        this.currentMap = currentMap;
    }

    void playerInput(KeyInput playerInput) {

        currentMap.mouseMove(playerInput);

        }






}
