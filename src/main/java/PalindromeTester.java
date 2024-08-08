public class PalindromeTester {

    public boolean palindromeTester(String palindrome) {
        return false;
    }

    /**
     * Removes spaces, capitalisation and punctuation from given string
     * @param string string to strip
     * @return stripped string
     */
    public String stringStripper(String string) {
        var withoutSpaces = string.replaceAll("\s", "");

        return withoutSpaces;
    }
}