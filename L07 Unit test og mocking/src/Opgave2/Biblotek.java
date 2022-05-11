package Opgave2;

import java.time.LocalDate;

public class Biblotek {
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     *       beregnetDato < faktiskDato
     *      (beregnetDato er forventet afleveringsdato og
     *       faktiskDato er den dag bogen blev afleveret; voksen er
     *       sand, hvis det er en voksen og falsk ellers)
     */

    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen){
        //Dette er bare et if staement
        return voksen ? 20 : 10;
        // dette er det samme
//        if (voksen){
//            return 20;
//        } else return 10;
    }
}
