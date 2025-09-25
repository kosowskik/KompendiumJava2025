package obiektowe.dom;

public class DomDemo {

    public static void main(String[] args) {
        Okno[] okna = {new Okno(), new Okno(), new Okno(), new Okno()};
        for (int i = 0; i < okna.length; i++){
            okna[i].otworz();
        }
        Lozko lozko1 = new Lozko(14);
        Lozko lozko2 = new Lozko();

        Pokoj pokojDomyslny = new Pokoj();
        Pokoj pokojDrugi = new Pokoj(okna, lozko1);
        Dom domGlowny = new Dom(new Pokoj[]{pokojDomyslny, pokojDrugi});
        System.out.println(domGlowny);
        //domGlowny.pos
    }

    //ZADANIE 51

}
