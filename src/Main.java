// Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.

public class Main {
    public static void main(String[] args) {
        VowelChecker checker = new VowelChecker();
        String input = "aeiou";

        boolean result = checker.areAllCharactersVowels(input);

        System.out.println("Are all characters in \"" + input + "\" vowels? " + result);

    }
}