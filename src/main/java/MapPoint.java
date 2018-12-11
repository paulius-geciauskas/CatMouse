/**
 * Created by Admin on 2018-12-06.
 */
public class MapPoint  {

  //  private boolean X;
   // private boolean K;

    private PointType p ;

    public void setP(PointType p) {
        this.p = p;
    }

    //Konstruktorius
    public MapPoint(String P){

        this.p=PointType.valueOf(P);

    }



    @Override
    public String toString() {
        return  ""+ p ;
    }
}


