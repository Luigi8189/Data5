import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test

    void testCompareDates() {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean[] risultati = org.example.Main.Main.compareDates(data1, data2);

        assertTrue(risultati[0]); //data1 è prima di data2
        assertTrue(risultati[1]); //data2 è dopo data1
        assertFalse(risultati[2]); // le date non sono uguali

    }
}