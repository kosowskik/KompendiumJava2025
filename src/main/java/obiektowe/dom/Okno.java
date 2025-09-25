package obiektowe.dom;

public class Okno {
    private boolean otwarte = false;

    @Override
    public String toString() {
        return "Okno{" +
                "otwarte=" + otwarte +
                '}';
    }
    public void otworz(){
        otwarte = true;
    }
    public void zamknij(){
        otwarte = false;
    }


}
