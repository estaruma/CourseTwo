public class VowelChecker {

    public boolean areAllCharactersVowels(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char ch : input.toCharArray()) {
            if (!isVowel(ch)) {
                return false;
            }
        }

        return true;
    }


    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
