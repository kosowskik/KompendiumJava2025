package obiektowe.dom2;

import java.util.Arrays;

public class Dom {

    private Pokoj[] pokoje;

    public Dom(Pokoj[] pokoje) {
        this.pokoje = pokoje;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "pokoje=" + Arrays.toString(pokoje) +
                '}';
    }
}
