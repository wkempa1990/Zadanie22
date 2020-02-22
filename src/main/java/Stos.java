public class Stos {
    int[] tablica;
    int wierzcholek;

    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stos(int Rozmiar) {
        tablica = new int[Rozmiar];
        wierzcholek = 0;
    }

    // Metoda dodająca na stos
    int dodaj(int wepchnijNaGore) {

        tablica[wierzcholek] = wepchnijNaGore;
        wierzcholek++;

        return wepchnijNaGore;
    }

    // Metoda usuwajaca ze stosu
    int usun() {
        if (wierzcholek <= 0) {
            System.out.println("Stos jest pusty");
        }
        int usuwanie = tablica[wierzcholek - 1];
        wierzcholek--;
        return usuwanie;
    }

    // Metoda wyświetlająca zawartość stosu
    public int zawartosc() {
        return wierzcholek;
    }

    public boolean isEmpty() {
        if (wierzcholek == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Metoda zwracająca prawdę, jeżeli stos jest pusty
    boolean jestPusty() {
        if (wierzcholek == 0) {
            return true;
        } else
            return false;
    }

    //ZADANIE 4
    // Metoda odwracająca kolejność elementów na stosie
    public int odwracanie() {
        for (int i = 0; i < wierzcholek / 2; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[wierzcholek - 1 - i];
            tablica[wierzcholek - 1 - i] = temp;

        }
        return 0;
    }

    public int[] getStos() {

        return new int[0];
    }
}