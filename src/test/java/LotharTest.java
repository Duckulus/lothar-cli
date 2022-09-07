import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import us.duckul.lothar.Lothar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotharTest {

    @Test
    @DisplayName("Default Name of Lothar Class should be Lothar von Trotha")
    public void testDefaultFullName() {
        Lothar lothar = Lothar.LotharFactory.createLothar();
        assertEquals(lothar.getFullName(), "Lothar von Trotha");
    }

    @Test
    @DisplayName("When instantiating an instance of Lothar with a String, its display name should equal it")
    public void testFullName() {
        String fullName = "Lothar";
        Lothar lothar = Lothar.LotharFactory.createLothar(fullName);
        assertEquals(lothar.getFullName(), fullName);
    }

    @Test
    @DisplayName("Sister name should be Clara")
    public void testSisterName() {
        assertEquals(Lothar.getSisterName(), "Clara");
    }

}
