import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethoden {
    @Test
    void myName() {
        /// VOID
    }

    @Test
    void isMehrAls0() {

        assertTrue(Main.isMehrAls0(0));
        assertTrue(Main.isMehrAls0(5));
        assertFalse(Main.isMehrAls0(-6));

    }

    @Test
    void square() {
        assertEquals(Main.square(5), 25);
        assertEquals(Main.square(-2), 4);
    }
}
