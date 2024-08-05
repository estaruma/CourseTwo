class StringWords {
    private String text;


    public StringWords(String text) {
        this.text = text;
    }

    // get

    public String getText() {
        return text;
    }
}


// method to count words
class WordCounter {
    public int countWords(StringWords stringCounter) {
        String text = stringCounter.getText();
        // if null/ empty
        if (text == null || text.isEmpty()) {
            return 0;
        }


        // split words content
        String[] words = text.split("\\s+");
        return words.length;
    }
}