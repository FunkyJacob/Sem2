package Opgave1;

import model.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    private BilForsikring bilForsikring;

    @BeforeEach
    public void setUpBeforeEach() {
        this.bilForsikring = new BilForsikring();
    }

    @Test
    @Order(1)
    void setGrundPraemie_ved_negativ_verdi(){
        //arrange
        int pris = -500;
        bilForsikring = bilForsikring;

        //act

        //assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilForsikring.setGrundpaemie(pris);
        });
        assertTrue(exception.getMessage().contains("grundPr skal vaere positiv"));
    }



    @Test
    @Order(2)
    void beregnPraemie_Med_for_ung_person(){
        //arrange
        int pris = 500;
        int alder = 17;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        bilForsikring.setGrundpaemie(pris);

        //act
        Exception exception  = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);
    });
    assertTrue(exception.getMessage().contains("Du er for ung til at tegne en forsikring"));

    }

    @Test
    @Order(3)
    void beregnPraemie_Med_for_mange_skadefri_aar(){
        //arrange
        int pris = 500;
        int alder = 19;
        boolean isKvinde = false;
        int skadeFrieaer = 5;
        bilForsikring.setGrundpaemie(pris);

        //act
        Exception exception  = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("Du kan ikke have kaert skadefri saelaenge"));

    }
    @Test
    @Order(4)
    void beregnPraemie_Med_Negative_Skadefri_aar(){
        //arrange
        int pris = 500;
        int alder = 19;
        boolean isKvinde = false;
        int skadeFrieaer = -5;
        bilForsikring.setGrundpaemie(pris);

        //act
        Exception exception  = assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(alder,isKvinde,skadeFrieaer);
        });
        assertTrue(exception.getMessage().contains("Antal skade frie aer skal vaere positiv"));
    }




}