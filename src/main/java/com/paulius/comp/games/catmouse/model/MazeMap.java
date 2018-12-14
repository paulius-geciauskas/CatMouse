package com.paulius.comp.games.catmouse.model;

import java.util.Queue;

/**
 * Created by Admin on 2018-12-06.
 */
public class MazeMap {
    private MapPoint[][] currentMap;


    public void setCurrentMap(MapPoint[][] currentMap) {
        this.currentMap = currentMap;
    }

    public MazeMap(MapPoint[][] currentMap) {
        this.currentMap = currentMap;
    }


    public MapPoint mouseCoord() {
        return objectSearch(PointType.MOUSE);

    }

    public MapPoint catCoord() {
        return objectSearch(PointType.CAT);

    }

    private MapPoint objectSearch(PointType objectForSearch) {

        for (int x = 0; x < currentMap.length; x++) {
            for (int y = 0; y < currentMap[x].length; y++) {
                if (currentMap[x][y].getP().equals(objectForSearch)) {
                    return new MapPoint(objectForSearch, x, y);
                }
            }

        }
        throw new RuntimeException("No" + objectForSearch + "found");
    }


    public void mouseMove(KeyInput input) {
        if ((input.equals(KeyInput.DOWN)) && (currentMap[mouseCoord().getX()][mouseCoord().getY() - 1].getP().equals(PointType.EMPTY) ||
                currentMap[mouseCoord().getX()][mouseCoord().getY() - 1].getP().equals(PointType.WALL))) {
            currentMap[mouseCoord().getX()][mouseCoord().getY()].setP(PointType.EMPTY);
            currentMap[mouseCoord().getX()][mouseCoord().getY() - 1].setP(PointType.MOUSE);
        }
        if ((input.equals(KeyInput.UP)) && (currentMap[mouseCoord().getX()][mouseCoord().getY() + 1].getP().equals(PointType.EMPTY) ||
                currentMap[mouseCoord().getX()][mouseCoord().getY() + 1].getP().equals(PointType.WALL))) {
            currentMap[mouseCoord().getX()][mouseCoord().getY()].setP(PointType.EMPTY);
            currentMap[mouseCoord().getX()][mouseCoord().getY() + 1].setP(PointType.MOUSE);
        }
        if ((input.equals(KeyInput.LEFT)) && (currentMap[mouseCoord().getX() - 1][mouseCoord().getY()].getP().equals(PointType.EMPTY) ||
                currentMap[mouseCoord().getX() - 1][mouseCoord().getY()].getP().equals(PointType.WALL))) {
            currentMap[mouseCoord().getX()][mouseCoord().getY()].setP(PointType.EMPTY);
            currentMap[mouseCoord().getX() - 1][mouseCoord().getY()].setP(PointType.MOUSE);
        }
        if ((input.equals(KeyInput.RIGHT)) && (currentMap[mouseCoord().getX() + 1][mouseCoord().getY()].getP().equals(PointType.EMPTY) ||
                currentMap[mouseCoord().getX() + 1][mouseCoord().getY()].getP().equals(PointType.WALL))) {
            currentMap[mouseCoord().getX()][mouseCoord().getY()].setP(PointType.EMPTY);
            currentMap[mouseCoord().getX() + 1][mouseCoord().getY()].setP(PointType.MOUSE);
        }
    }

    public MapPoint calcNextCatMove(MapPoint[][] currentMap) {
        MapPoint mouse = mouseCoord();
        MapPoint cat = catCoord();
        Queue<MapPoint> queue = new java.util.LinkedList<MapPoint>();
        queue.add(mouse);
        while (!queue.isEmpty()) {
            MapPoint p = queue.remove();

            if (currentMap[p.getX() + 1][p.getY()].getP().equals(PointType.CAT)) return p;
            if (currentMap[p.getX() - 1][p.getY()].getP().equals(PointType.CAT)) return p;
            if (currentMap[p.getX()][p.getY() + 1].getP().equals(PointType.CAT)) return p;
            if (currentMap[p.getX()][p.getY() - 1].getP().equals(PointType.CAT)) return p;

            if (currentMap[p.getX() + 1][p.getY()].getP().equals(PointType.EMPTY))
                queue.offer(currentMap[p.getX() + 1][p.getY()]);
            if (currentMap[p.getX() - 1][p.getY()].getP().equals(PointType.EMPTY))
                queue.offer(currentMap[p.getX() - 1][p.getY()]);
            if (currentMap[p.getX()][p.getY() + 1].getP().equals(PointType.EMPTY))
                queue.offer(currentMap[p.getX()][p.getY() + 1]);
            if (currentMap[p.getX()][p.getY() - 1].getP().equals(PointType.EMPTY))
                queue.offer(currentMap[p.getX()][p.getY() - 1]);

        }
        throw new RuntimeException("No path found");
    }


}
