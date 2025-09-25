package obiektowe.dom2;

import java.util.Arrays;

public class Pokoj {

    private Okno[] okna;
    private Lozko lozko;

    public Pokoj(Okno[] okna, Lozko lozko) {
        this.okna = okna;
        this.lozko = lozko;
    }

    public Pokoj() {
        okna = new Okno[]{new Okno(), new Okno()};
        lozko = new Lozko(5);
    }

    public void cleanRoom(){
        for (Okno okno : okna) {
            okno.close();
            System.out.println(okno);
        }
        lozko.clean();
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "okna=" + Arrays.toString(okna) +
                ", lozko=" + lozko +
                '}';
    }
}
