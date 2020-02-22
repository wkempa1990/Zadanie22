public class Stos {
    double[] tablica;
    int wierzcholek;
    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stos(int Rozmiar) {
        tablica = new double[Rozmiar];
        wierzcholek = 0;
    }
    // Metoda dodająca na stos
    void dodaj(double wepchnijNaGore) {
        if (wierzcholek < tablica.length) {
            tablica[wierzcholek] = wepchnijNaGore;
            wierzcholek++;
        } else {
            System.out.println("Stos przepelniony");
        }
    }
    // Metoda usuwajaca ze stosu
    double usun() {
        if (wierzcholek <= 0) {
            System.out.println("Stos jest pusty");
        }
        double usuwanie = tablica[wierzcholek - 1];
        wierzcholek--;
        return usuwanie;
    }
    // Metoda wyświetlająca zawartość stosu
    void zawartosc() {
        if (wierzcholek == 0) {
            System.out.println("Stos jest pusty");
        }
        int temp = wierzcholek - 1;
        do {
            System.out.println(tablica[temp]);
            temp--;
        } while (temp > -1);
    }
    // Metoda zwracająca prawdę, jeżeli stos jest pusty
    boolean jestPusty() {
        if (wierzcholek == 0) {
            return true;
        } else
            return false;
    }
}
