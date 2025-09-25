package obiektowe.dom;

public class Pokoj {
    private Lozko lozko;
    private Okno[] okna;

    public Pokoj(Okno[] okna, Lozko lozko) {
        this.lozko = lozko;
        this.okna = okna;
    }

    public Pokoj(){
        okna = new Okno[]{new Okno(), new Okno()};
        lozko = new Lozko(5);
    }

    public void posprzataj(){
        for(Okno okno : okna){
            okno.zamknij();
        }
        lozko.posciel();
    }

}
