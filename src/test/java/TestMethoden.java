import org.example.javabasics.Novice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethoden {
    @Test
    void myName() {
        /// VOID
    }

    @Test
    void isMehrAls0() {

        assertTrue(Novice.isMehrAls0(0));
        assertTrue(Novice.isMehrAls0(5));
        assertFalse(Novice.isMehrAls0(-6));

    }

    @Test
    void square() {
        assertEquals(25, Novice.square(5));
        assertEquals(4, Novice.square(-2));
    }
}
