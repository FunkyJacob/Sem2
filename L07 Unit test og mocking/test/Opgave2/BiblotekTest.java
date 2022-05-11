package Opgave2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BiblotekTest {
 // denne er lavet med Esben på tavlen
    //Testen virker perfekt men koden i den anden class er ikke lavet

    @Test
    void beregnBøde_enTilSyvDageOverskredetVoksen() {
        //arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato1dag = LocalDate.of(2022,3,2);
        LocalDate faktiskDato7Dag = LocalDate.of(2022,3,8);
        boolean voksen = true;
        int expectedBøde = 20;

        //act
        int actualBøde1Dag = biblotek.beregnBøde(beregnetDato,faktiskDato1dag,voksen);
        int actualBøde7Dag = biblotek.beregnBøde(beregnetDato,faktiskDato7Dag,voksen);

        //assert
        assertEquals(expectedBøde,actualBøde1Dag);
        assertEquals(expectedBøde,actualBøde7Dag);

    }

    @Test
    void beregnBøde_enTilSyvDageOverskredetBarn() {
        //arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato1dag = LocalDate.of(2022,3,2);
        LocalDate faktiskDato7Dag = LocalDate.of(2022,3,8);
        boolean voksen = false;
        int expectedBøde = 10;

        //act
        int actualBøde1Dag = biblotek.beregnBøde(beregnetDato,faktiskDato1dag,voksen);
        int actualBøde7Dag = biblotek.beregnBøde(beregnetDato,faktiskDato7Dag,voksen);

        //assert
        assertEquals(expectedBøde,actualBøde1Dag);
        assertEquals(expectedBøde,actualBøde7Dag);

    }

    @Test
    void beregnBøde_OtteTilFjortenDageOverskredetVoksen() {
        //arrange
        Biblotek biblotek = new Biblotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato1dag = LocalDate.of(2022,3,9);
        LocalDate faktiskDato7Dag = LocalDate.of(2022,3,15);
        boolean voksen = true;
        int expectedBøde = 60;

        //act
        int actualBøde1Dag = biblotek.beregnBøde(beregnetDato,faktiskDato1dag,voksen);
        int actualBøde7Dag = biblotek.beregnBøde(beregnetDato,faktiskDato7Dag,voksen);

        //assert
        assertEquals(expectedBøde,actualBøde1Dag);
        assertEquals(expectedBøde,actualBøde7Dag);

    }




}