import org.junit.jupiter.api.Test;
import us.duckul.lothar.Lothar;

import java.util.Objects;

public class LotharTest {

    @Test
    public void testDefaultFullName() {
        Lothar lothar = Lothar.LotharFactory.createLothar();
        assert Objects.equals(lothar.getFullName(), "Lothar von Trotha");
    }

    @Test
    public void testFullName() {
        String fullName = "Lothar";
        Lothar lothar = Lothar.LotharFactory.createLothar(fullName);
        assert Objects.equals(lothar.getFullName(), fullName);
    }

    @Test
    public void testSisterName() {
        assert Lothar.getSisterName().equals("Clara");
    }

}
