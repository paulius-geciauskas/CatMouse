import java.util.Arrays;

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
     //  for (int i = 0; i < print.length; i++) {
     //      System.out.println(print[i]);
     // }
     //   System.out.println();

    }
}
