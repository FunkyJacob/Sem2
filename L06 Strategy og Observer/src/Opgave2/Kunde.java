package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    List<BogTitel> bogTitelList = new ArrayList<>();
    private String navn;

    public Kunde(String navn) {
        this.navn = navn;
    }
}
