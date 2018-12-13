package com.paulius.comp.games.catmouse.model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Admin on 2018-12-06.
 */
public class MazeMap {
    private MapPoint[][] currentMap;
    public static Queue<Coordinate> q = new LinkedList<Coordinate>();

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
                    return new Coordinate(x, y, null);
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

    public void catMove() {
        Coordinate cat = catCoord();
        Coordinate mouse = mouseCoord();
        Coordinate catNext = shortestPath(mouse.getX(),mouse.getY());
        currentMap[catNext.getX()][catNext.getY()].setP(PointType.CAT);
        currentMap[cat.getX()][cat.getY()].setP(PointType.EMPTY);



    }

    private Coordinate shortestPath(int x, int y) {
        q.add(new Coordinate(x, y, null));
        while (!q.isEmpty()) {
            Coordinate p = q.remove();
            if (currentMap[p.getX()][p.getY()].getP().equals(PointType.CAT)) {
                System.out.println("OK");
                return p.parent;
            }
            if(isEmpty(p.getX()+1,p.getY())) {
                currentMap[p.getX()][p.getY()].setCheck(false);
                Coordinate nextP = new Coordinate(p.getX()+1,p.getY(), p);
                q.add(nextP);
            }
            if(isEmpty(p.getX()-1,p.getY())) {
                currentMap[p.getX()][p.getY()].setCheck(false);
                Coordinate nextP = new Coordinate(p.getX()-1,p.getY(), p);
                q.add(nextP);
            }
            if(isEmpty(p.getX(),p.getY()+1)) {
                currentMap[p.getX()][p.getY()].setCheck(false);
                Coordinate nextP = new Coordinate(p.getX(),p.getY()+1, p);
                q.add(nextP);
            }
            if(isEmpty(p.getX(),p.getY()-1)) {
                currentMap[p.getX()][p.getY()].setCheck(false);
                Coordinate nextP = new Coordinate(p.getX(),p.getY()-1, p);
                q.add(nextP);
            }
        }
        return null;
    }

    private boolean isEmpty(int x, int y) {
        if ((currentMap[x][y].getP().equals(PointType.EMPTY)||currentMap[x][y].getP().equals(PointType.MOUSE)) && currentMap[x][y].isCheck() ) {
            return true;
        }
        return false;
    }
}
