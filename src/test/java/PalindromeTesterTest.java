import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTesterTest {

    private final PalindromeTester palindromeTester = new PalindromeTester();

    @Test
    public void testPalindromeTester_specialCharacters() {
        assertTrue(palindromeTester.palindromeTester("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testStringStripper_removesSpaces() {
        assertEquals("helloworld", palindromeTester.stringStripper("  hello  world "));
    }

    @Test
    public void testStringStripper_removesCapitalization() {
        assertEquals("hello", palindromeTester.stringStripper("HeLlO"));
    }

    @Test
    public void testStringStripper_removesPunctuation() {
        assertEquals("hello", palindromeTester.stringStripper("hello!"));
    }
}
