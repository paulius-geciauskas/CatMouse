

/**
 * Created by Admin on 2018-12-06.
 */
public class Mouse {
    private int x;
    private int y;

    public MapPoint[][] moveRight(MapPoint[][] currentMap) {
      //  MapPoint[][]  map = currentMap;
        if (currentMap[mouseCoordinates(currentMap).getX()][mouseCoordinates(currentMap).getY()+1].toString().equals("E")) {
            currentMap[mouseCoordinates(currentMap).getX()][mouseCoordinates(currentMap).getY()].setP(PointType.E);
            currentMap[mouseCoordinates(currentMap).getX()][mouseCoordinates(currentMap).getY()+1].setP(PointType.P);
        }
//  Coordinate mouse = new Coordinate();
//   mouseCoordinates(currentMap).getX()
        return currentMap;
    }



    private Coordinate mouseCoordinates(MapPoint[][] currentMap) {
        Coordinate xy = new Coordinate();
        int x, y = 0;
        for (int i = 0; i < currentMap.length; i++) {
            for (int j = 0; j < currentMap[i].length; j++) {
                if (currentMap[i][j].toString().equals("P")) {
                    xy.setX(i);
                    xy.setY(j);
                }
            }

        }
      //  System.out.println(xy.getX()+" "+xy.getY());
        return xy;
    }

}
