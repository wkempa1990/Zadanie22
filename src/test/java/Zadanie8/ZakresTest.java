package Zadanie8;

import Zadanie6.SortowaniePrzezWstawienie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZakresTest {
    @Test
    void zakres() {
        Zakres zakres = new Zakres();
        int[] expected = {-1, 2, 3, 4, -2};
        int recived = 9;
        int wynik = zakres.zakres(expected);
        Assertions.assertEquals(recived, wynik);

    }
}