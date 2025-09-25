package obiektowe;

public class Drzewo {
    String nazwa;
    boolean iglaste;
    double wysokoscWMetrach;

    public void wyswietl(){
        System.out.printf("Drzewo %s typu %s ma wysokosc %.2fm\n", nazwa, typ(), wysokoscWMetrach);
    }
    private String typ(){
        if(iglaste){
            return "iglaste";
        } else {
            return "lisciaste";
        }
    }
    String dajNazwe(){
        return nazwa;
    }

}

//formatowany print
//%s - podstawia string
//%d - liczba całkowita
//%f - dziesietna czesc
