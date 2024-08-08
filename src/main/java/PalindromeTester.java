public class PalindromeTester {

    /**
     * Checks to see if the given string is a palindrome (Ignores spaces, caps and punctuation)
     * @param palindrome the string to test
     * @return whether the string is a palindrome
     */
    public boolean palindromeTester(String palindrome) {
        return false;
    }

    /**
     * Removes spaces, capitalisation and punctuation from given string
     * @param string the string to strip
     * @return stripped string
     */
    String stringStripper(String string) {
        var lowercaseString = string.toLowerCase();

        // Uses a combined regex to match punctuation: \\p{Punct} and spaces: \s
        return lowercaseString.replaceAll("[\\p{Punct}\s]", "");
    }
}