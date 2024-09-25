package org.example;

public class VowelChecker {
    public void checkForVowels(String input) throws NoVowelException {
        String lowerInput = input.toLowerCase();

        if(!lowerInput.contains("a") && !lowerInput.contains("e") && !lowerInput.contains("i") && !lowerInput.contains("o") && !lowerInput.contains("u")) {
            throw new NoVowelException("No vowels found:  " + input);
        }

        System.out.println("The input string contains vowels.");
    }

}
