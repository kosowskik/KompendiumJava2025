package karty;

public enum Ranga {
    DZIEWIEC(9),
    DZIESIEC(10),
    WALET(11),
    DAMA(12),
    KROL(13),
    AS(14);

    private int sila;

    Ranga(int sila) {
        this.sila = sila;
    }

    public int getSila() {
        return sila;
    }
}
