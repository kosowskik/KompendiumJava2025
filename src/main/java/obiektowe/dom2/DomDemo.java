package obiektowe.dom2;


import java.util.ArrayList;
import java.util.List;

public class DomDemo {
    public static void main(String[] args) {


        Okno[] okna = {new Okno(), new Okno(), new Okno(), new Okno()};
        int counter = 1;
        for (int i = 0; i < okna.length; i++) {
            System.out.println("Aktualny stan okien: " + okna[i]);
            okna[i].open();
            System.out.println("Opened window nr: " + counter);
            counter++;
            System.out.println(okna[i]);
        }

        Lozko lozko1 = new Lozko(14);
        System.out.println(lozko1);

        Pokoj pokoj = new Pokoj();
        pokoj.cleanRoom();
        System.out.println(pokoj);

        Pokoj pokoj1 = new Pokoj();
        Pokoj pokoj2 = new Pokoj(okna, lozko1);

        Dom dom = new Dom(new Pokoj[]{pokoj1, pokoj2});
        System.out.println(dom);
    }
}
