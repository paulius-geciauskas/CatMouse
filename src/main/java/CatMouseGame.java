/**
 * Created by Admin on 2018-12-06.
 *
 * 1 versija, pele eina tik i desine
 *
 */
public class CatMouseGame {
    public static void main(String[] args) {
        ConsoleOutput console = new ConsoleOutput();
        Mouse mouse = new Mouse();
        MapLoader startingMap = new MapLoader();  // Sukuriamas pradinis zemelapis
        MazeMap map = new MazeMap(startingMap.LoadMap());
        console.PrintConsole(map.currentMap);
map.setCurrentMap(mouse.moveRight(map.currentMap));   //pele eina i desine
console.PrintConsole(map.currentMap);




    }

}
