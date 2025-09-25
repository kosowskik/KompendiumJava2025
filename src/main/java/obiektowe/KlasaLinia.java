package obiektowe;

public class KlasaLinia {
    char wypelnienie;
    int dlugosc;

    public void drukujLinie(){
        for(int i = 0; i < dlugosc; i++){
            System.out.print(wypelnienie);
        }
    }
}
