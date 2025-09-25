package obiektowe.dom2;

import java.time.LocalDate;

public class Lozko {

    private LocalDate whenLastDone = LocalDate.now();

    public Lozko(int daysSinceLastCleaning) {
        this.whenLastDone = whenLastDone.minusDays(daysSinceLastCleaning);
        System.out.println(whenLastDone);
    }

    public void clean(){
        whenLastDone = LocalDate.now();
    }

    public LocalDate getWhenLastDone() {
        return whenLastDone;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "whenLastDone=" + whenLastDone +
                '}';
    }
}
