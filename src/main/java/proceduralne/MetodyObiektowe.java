package proceduralne;

public class MetodyObiektowe {

    public static void main(String[] args) {

        Produkt produkt1 = new Produkt();
        produkt1.nazwa = "Rower";
        produkt1.cena = 1200;

        Produkt produkt2 = new Produkt();
        produkt2.nazwa = "stary rower";
        produkt2.cena = 800;

        produkt1.wyswietlOpis();
        produkt2.wyswietlOpis();

        Produkt[] produkty = new Produkt[2];
        produkty[0] = produkt1;
        produkty[1] = produkt2;

        double sumaCeny = 0;
        for(Produkt produkt : produkty){
            sumaCeny += produkt.cena;
        }
        System.out.println("Łączna cena wynosi: " + sumaCeny);
    }
}
