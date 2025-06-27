import org.example.javabasics.LevelNovice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethoden {
    @Test
    void myName() {
        /// VOID
    }

    @Test
    void isMehrAls0() {

        assertTrue(LevelNovice.isMehrAls0(0));
        assertTrue(LevelNovice.isMehrAls0(5));
        assertFalse(LevelNovice.isMehrAls0(-6));

    }

    @Test
    void square() {
        assertEquals(25, LevelNovice.square(5));
        assertEquals(4, LevelNovice.square(-2));
    }
}
