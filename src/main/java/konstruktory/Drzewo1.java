package konstruktory;

public class Drzewo1 {
    private String nazwa;
    private boolean iglaste;
    private double wysokoscWMetrach;

    public Drzewo1(String nazwa, boolean iglaste, double wysokoscWMetrach){
        this.nazwa = nazwa;
        this.iglaste = iglaste;
        this.wysokoscWMetrach = wysokoscWMetrach;
        System.out.println("Tworze drzewo");
    }


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
    public String dajTekstowaReprezentacje() {
        return String.format("Drzwo %s typu: %s wysokość: %8.2fm\n",
                nazwa, typ(), wysokoscWMetrach);
    }
    public String toString(){
        return String.format("Drzewo %s typu %s ma wysokosc %.2fm\n", nazwa, typ(), wysokoscWMetrach);

    }
    public void setHeight(double newHeight){
        wysokoscWMetrach = newHeight;

    }

    public double getWysokoscWMetrach() {
        return wysokoscWMetrach;
    }

    public void grow(int howMuch){
        if (howMuch < 0){
            return;
        }
        wysokoscWMetrach += howMuch;
    }
}

//formatowany print
//%s - podstawia string
//%d - liczba całkowita
//%f - dziesietna czesc

//TO_STRING
//każda klasa w javie dziedziczy po klasie Object

