package proceduralne.zadanie;

public class ZwierzetaWDomu {

    public static void main(String[] args) {
        Zwierze zwierze1 = new Zwierze();
        Zwierze zwierze2 = new Zwierze();

        zwierze1.typ = "Pies";
        zwierze1.wiek = 5;

        zwierze2.typ = "Kot";
        zwierze2.wiek = 7;

        zwierze2.wyswietlOpis();
        zwierze1.wyswietlOpis();

        Zwierze[] zwierzeta = new Zwierze[2];
        zwierzeta[0] = zwierze1;
        zwierzeta[1] = zwierze2;
        double sumarycznyWiek = 0;
        for(Zwierze zwierze:zwierzeta){
            sumarycznyWiek += zwierze.wiek;
        }
        double sredniWiek = sumarycznyWiek/zwierzeta.length;
        System.out.println("Sredni wiek zwierzat w domu wynosi: " + sredniWiek);
    }
}
