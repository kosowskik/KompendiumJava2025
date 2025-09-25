package obiektowe;

public class KlasaLiniaMain {
    public static void main(String[] args) {
        KlasaLinia linia1 = new KlasaLinia();
        KlasaLinia linia2 = new KlasaLinia();

        linia1.dlugosc = 30;
        linia1.wypelnienie = '*';

        linia1.drukujLinie();

    }
}
