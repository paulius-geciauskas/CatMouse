package com.paulius.comp.games.catmouse.output;

import com.paulius.comp.games.catmouse.model.MapPoint;

/**
 * Created by Admin on 2018-12-06.
 */
public class ConsoleOutput {
    public void PrintConsole(MapPoint[][] m) {
       MapPoint print[][] = m;


        for (int i = 0; i < print.length; i++) {
            for (int j = 0; j < print[i].length ; j++) {
                System.out.print(print[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
