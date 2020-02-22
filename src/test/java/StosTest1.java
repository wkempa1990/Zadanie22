
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StosTest1 {
    @Test
    void dodaj() {
        Stos stos = new Stos(4);
        stos.dodaj(10);
        stos.dodaj(20);
        stos.dodaj(30);
        stos.dodaj(40);
        int[] expected = {10, 20, 30, 40};
        int[] recived = stos.getStos();
        Assertions.assertNotEquals(expected, recived);
    }

    @Test
    void usun() {
        Stos stos = new Stos(100);
        stos.dodaj(10);
        stos.dodaj(20);
        stos.dodaj(30);
        stos.dodaj(40);
        stos.dodaj(50);
        stos.dodaj(60);
        int expected = 60;
        int recived = stos.dodaj(60);
        Assertions.assertEquals(expected, recived);
    }

    @Test
    void zawartosc() {
        Stos stos = new Stos(100);
        stos.dodaj(10);
        stos.dodaj(20);
        stos.dodaj(30);
        stos.dodaj(40);
        stos.dodaj(50);
        stos.dodaj(60);
        int expected = 6;
        int recived = stos.zawartosc();
        Assertions.assertEquals(expected, recived);
    }

    @Test
    void jestPusty() {
        Stos stos = new Stos(100);
        stos.dodaj(10);
        stos.dodaj(20);
        stos.dodaj(30);
        stos.dodaj(40);
        stos.dodaj(50);
        stos.dodaj(60);
        Assertions.assertFalse(stos.jestPusty());
    }

    @Test
    void odwracanie() {
        Stos stos = new Stos(4);
        stos.dodaj(10);
        stos.dodaj(20);
        stos.dodaj(30);
        stos.dodaj(40);
        int[] expected = {40, 30, 20, 10};
        int recived = stos.odwracanie();
        Assertions.assertNotEquals(expected, recived);
    }

}