package konstruktory;
public class DrzewoDemo1 {

    public static void main(String[] args) {
        Drzewo1 drzewo1 = new Drzewo1("Kasztan", false, 45.555444);
        Drzewo1 drzewo2 = new Drzewo1("Jodła", true, 12.987);

        System.out.println(drzewo1.toString());

//        drzewo1.wyswietl();
//        drzewo2.wyswietl();
//        drzewo1.setHeight(drzewo1.getWysokoscWMetrach() + 2);
        drzewo1.grow(2);
        drzewo1.wyswietl();

    }
}
//enkapsulacja/hermetyzacja - z obiektem komunikujemy sie wylacznie przez jego metody. stan jest ukryty
