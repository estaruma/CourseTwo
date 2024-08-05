public class Main {

    public static void main(String[] args) {
        StringWords exerciseFive = new StringWords("Hello, this is a simple Java program to count words.");
        WordCounter wordCounter = new WordCounter();

        int wordCount = wordCounter.countWords(exerciseFive);

        System.out.println(wordCount);
    }
}