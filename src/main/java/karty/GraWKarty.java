package karty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraWKarty {

    public void porownaj(Karta karta1, Karta karta2) {
        if (karta1.sprawdzSile() > karta2.sprawdzSile()) {
            System.out.printf("Karta %s jest wieksza od %s", karta1, karta2);
        } else if (karta1.sprawdzSile() < karta2.sprawdzSile()) {
            System.out.printf("Karta %s jest wieksza od %s", karta2, karta1);
        } else {
            System.out.printf("Karta %s oraz karta %s są równe", karta1, karta2);
        }
    }

    public List<Karta> zwrocTalie() {
        List<Karta> karty = new ArrayList<>();

        for (Ranga ranga : Ranga.values()) {
            System.out.println(ranga);
            for (Kolor color : Kolor.values()) {
                Karta karta = new Karta(color, ranga);
                karty.add(karta);
            }

        }
        Collections.shuffle(karty);
        return karty;
    }
    }
