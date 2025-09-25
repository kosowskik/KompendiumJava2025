package obiektowe;

public class SamochodDemo {

    public static void main(String[] args) {
        Samochod car1 = new Samochod("Opel", 150);
        Samochod car2 = new Samochod("Dacia", 200);

        car1.wyswietlSamochod();
        car1.pojedz(500);
        car1.wyswietlSamochod();

        car2.wyswietlSamochod();
        car2.pojedz(150);
        car2.wyswietlSamochod();

    }
}
