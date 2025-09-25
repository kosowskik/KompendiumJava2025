package obiektowe.dom;

import java.time.LocalDate;

public class Lozko {
    private LocalDate dataOstatniejZmiany = LocalDate.now();

    public Lozko(int liczbaDniOdZmiany) {
        this.dataOstatniejZmiany = LocalDate.now().minusDays(liczbaDniOdZmiany);
    }
    public Lozko(){
        this.dataOstatniejZmiany = LocalDate.now();
    }

    public void posciel() {
        dataOstatniejZmiany = LocalDate.now();
    }
}
