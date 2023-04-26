package untilStop;

import java.awt.print.Printable;
import java.util.Scanner;

public class UntilStop {

    public UntilStop(String toString) {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();
        String line;




        System.out.println("Enter text (write 'stop' to quit):");

        do {
            line = scanner.nextLine();
            counter.count(line);
            System.out.println("Enter something more or write 'stop' to quit):");
        } while (!line.equals("stop"));

        System.out.println("Number of lines: " + counter.getLineCount());
        System.out.println("Number of characters: " + counter.getCharCount());
    }
}