package Zadanie6;

public class SortowaniePrzezWstawienie {
    // metoda sortuje elementy tablicy przekazanej jako parametr
    public int[] sortowaniePrzezWstawianie(int[] wejscie) {
        // pobieramy elementy z części nieposortowanej tablicy
        for (int i = 1; i < wejscie.length; i++) {
            int liczba = wejscie[i];
            int j = i;
            // w pętli "robimy" dla niego miejsce w
// posortowanej części tablicy
            while ((j > 0) && (wejscie[j - 1] > liczba)) {
                wejscie[j] = wejscie[j - 1];
                j--;
            }
            // wstawiamy go na odpowiednie miejsce
            wejscie[j] = liczba;
        }
        return wejscie;
    }
}
