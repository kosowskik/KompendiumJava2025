package karty;

import static karty.Kolor.*;
import static karty.Ranga.*;

public class KartaDemo {

    public static void main(String[] args) {


        Karta karta1 = new Karta(PIK, AS);
        Karta karta2 = new Karta(KIER, DZIESIEC);

        System.out.println(karta1);
        System.out.println(karta2);

        for (Ranga ranga : Ranga.values()) {
            System.out.println(ranga);
        }
        GraWKarty gra = new GraWKarty();
        gra.porownaj(karta2, karta1);
        System.out.println(gra.zwrocTalie());



    }

}
