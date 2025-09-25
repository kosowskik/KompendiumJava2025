package obiektowe;

public class DrzewoDemo {

    public static void main(String[] args) {
        Drzewo drzewo1 = new Drzewo();
        Drzewo drzewo2 = new Drzewo();

        drzewo1.nazwa = "kasztan";
        drzewo1.iglaste = false;
        drzewo1.wysokoscWMetrach = 45.545645645;
        drzewo2.nazwa = "jodła";
        drzewo2.iglaste = true;

        drzewo1.wyswietl();
        drzewo2.wyswietl();

    }
}
