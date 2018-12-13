package com.paulius.comp.games.catmouse.model;

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


    public Coordinate mouseCoord() {
        return objectSearch(PointType.MOUSE);

    }

    public Coordinate catCoord() {
        return objectSearch(PointType.CAT);

    }

    private Coordinate objectSearch(PointType objectForSearch) {

        for (int x = 0; x < currentMap.length; x++) {
            for (int y = 0; y < currentMap[x].length; y++) {
                if (currentMap[x][y].getP().equals(objectForSearch)) {
                    return new Coordinate(x, y);
                }
            }

        }
        throw new RuntimeException("No mouse found");
    }

    public void mouseMove(Coordinate newcoor) {

        Coordinate oldCoord = mouseCoord();
        if (currentMap[newcoor.getX()][newcoor.getY()].getP().equals(PointType.EMPTY)) {
            currentMap[oldCoord.getX()][oldCoord.getY()].setP(PointType.EMPTY);
            currentMap[newcoor.getX()][newcoor.getY()].setP(PointType.CAT);
        }
        if (currentMap[newcoor.getX()][newcoor.getY()].getP().equals(PointType.WALL)) {
            currentMap[oldCoord.getX()][oldCoord.getY()].setP(PointType.EMPTY);
            currentMap[newcoor.getX()][newcoor.getY()].setP(PointType.CAT);
        }
    }
    public void catMove(){
        Coordinate catCoord = catCoord();

    }
}
