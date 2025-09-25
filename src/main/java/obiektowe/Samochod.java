package obiektowe;

public class Samochod {
    private String marka;
    private int przebieg;
    private int przeglad = 1000;

    public Samochod(String marka, int przebieg){
        this.marka = marka;
        this.przebieg = przebieg;
    }

    public void wyswietlSamochod(){
        int doPrzegladu = przeglad-przebieg;
        System.out.printf("Samochod marki: %s ma przebieg %d km. Do następnego przeglądu zostało %d km", marka, przebieg, doPrzegladu);
        System.out.println();
    }
    public void pojedz(int km){
        przebieg += km;
    }

}
