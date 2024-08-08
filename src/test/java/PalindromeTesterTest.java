import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTesterTest {

    private final PalindromeTester palindromeTester = new PalindromeTester();

    @Test
    public void testPalindromeTester_true_odd() {
        assertTrue(palindromeTester.checkPalindrome("racecar"));
    }

    @Test
    public void testPalindromeTester_true_even() {
        assertTrue(palindromeTester.checkPalindrome("noon"));
    }

    @Test
    public void testPalindromeTester_false() {
        assertFalse(palindromeTester.checkPalindrome("hello world"));
    }

    @Test
    public void testPalindromeTester_stripping() {
        assertTrue(palindromeTester.checkPalindrome("Borrow or rob?"));
    }

    @Test
    public void testPalindromeTester_0or1length() {
        assertTrue(palindromeTester.checkPalindrome(""));
        assertTrue(palindromeTester.checkPalindrome("a"));
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
        assertEquals("hello", palindromeTester.stringStripper(".h?e,l/l(o!"));
    }

    @Test
    public void testStringStripper_emptyString() {
        assertEquals("", palindromeTester.stringStripper(""));
    }
}
