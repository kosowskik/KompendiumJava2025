public class Sklep {
    public static void main(String[] args) {

        double cenaRoweru = 1200;
        int raty = 12;
        double rataRoweru = cenaRoweru/raty;

        System.out.println("Oferta: Rower. Cena: " + cenaRoweru + "zł");
        System.out.println("Raty: " + raty);
        System.out.println("Rata roweru: " + rataRoweru);

        double kwotaBonusu = 1000;
        boolean bonus = cenaRoweru > kwotaBonusu;

        //String bonusText = ;
        String bonusLabel;
        System.out.println("Bonus za wydanie: " + kwotaBonusu + "zł: " + bonus);

        if(bonus){
            System.out.println("wysyłam bonus");
        }
    }
}
