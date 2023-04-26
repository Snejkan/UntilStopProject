package untilStop;

public class Counter {

    private int lineCount;
    private int charCount;

    public void count(String line) {
        if (!line.equals("stop")) {

            lineCount++;
            charCount += line.length();
        }
    }
    public int getLineCount() {
        return lineCount;
    }
    public int getCharCount() {
        return charCount;
    }
}



