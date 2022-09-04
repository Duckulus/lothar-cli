import org.junit.jupiter.api.Test;
import us.duckul.lothar.Lothar;

import java.util.Objects;

public class LotharTest {

    @Test
    public void testDefaultFullName() {
        Lothar lothar = Lothar.newInstance();
        assert Objects.equals(lothar.getFullName(), "Lothar von Trotha");
    }

    @Test
    public void testFullName() {
        String fullName = "Lothar";
        Lothar lothar = Lothar.newInstance(fullName);
        assert Objects.equals(lothar.getFullName(), "Lothar");
    }

    @Test
    public void testSisterName() {
        assert Lothar.getSisterName().equals("Clara");
    }

}
