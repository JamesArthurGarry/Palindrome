import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTesterTest {

    private final PalindromeTester palindromeTester = new PalindromeTester();

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
        assertEquals("hello", palindromeTester.stringStripper(".h?e,l/l(o!"));
    }

    @Test
    public void testStringStripper_emptyString() {
        assertEquals("", palindromeTester.stringStripper(""));
    }
}
