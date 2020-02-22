package Zadanie6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortowaniePrzezWstawienieTest {
    @Test
    void sortowaniePrzezWstawianie() {
        SortowaniePrzezWstawienie sortowaniePrzezWstawienie = new SortowaniePrzezWstawienie();
        int[] expected = {4, 6, 1, 2, 3, 8, 7, 9, 5, 10, 12, 11};
        int[] recived = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] posortowany = sortowaniePrzezWstawienie.sortowaniePrzezWstawianie(expected);
        Assertions.assertArrayEquals(recived, posortowany);

    }

}