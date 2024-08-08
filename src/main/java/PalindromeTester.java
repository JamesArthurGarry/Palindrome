public class PalindromeTester {

    /**
     * Checks to see if the given string is a palindrome (Ignores spaces, caps and punctuation)
     * @param possiblePalindrome the string to test
     * @return whether the string is a palindrome
     */
    public boolean checkPalindrome(String possiblePalindrome) {

        // Remove ignored characters
        var strippedString = stringStripper(possiblePalindrome);

        // If the length of the stripped given string is 0 or 1 then it is automatically a palindrome
        var stringLength = strippedString.length();
        if (stringLength < 2) {
            return true;
        }

        // Split the string in half and check if the first half is the same as the second reversed
        int mid = stringLength / 2;
        var firstHalf = strippedString.substring(0, mid);
        // If odd number of characters then don't include the middle as it's not necessary to be checked
        // i.e racecar -> rac e car, only 'rac' and 'car' have to be compared
        var secondHalf = strippedString.substring(stringLength % 2 == 1 ? mid + 1 : mid);

        return firstHalf.equals(new StringBuilder(secondHalf).reverse().toString());
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