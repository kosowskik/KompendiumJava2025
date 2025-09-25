package obiektowe.dom2;

public class Okno {
    private boolean isOpen;

    public void open() {
        isOpen = true;
    }
    public void close(){
        isOpen = false;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "isOpen=" + isOpen +
                '}';
    }
}
