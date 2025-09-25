package karty;

public class Karta {
    private Kolor kolor;
    private Ranga ranga;

    public Karta(Kolor kolor, Ranga ranga) {
        this.kolor = kolor;
        this.ranga = ranga;
    }

    public int sprawdzSile(){
        return ranga.getSila();
    }

    @Override
    public String toString() {
        return "Karta{" +
                "kolor=" + kolor +
                ", ranga=" + ranga +
                '}';
    }
}
