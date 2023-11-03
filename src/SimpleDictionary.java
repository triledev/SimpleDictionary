import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleDictionary {

    private final Map<String, String> dictionary;

    public SimpleDictionary() {
        dictionary = new HashMap<>();
        // Initialize with some words and definitions
        dictionary.put("Java", "A high-level, class-based, object-oriented programming language.");
        dictionary.put("Python", "An interpreted, high-level and general-purpose programming language.");
        dictionary.put("Dictionary", "A book or electronic resource that lists the words of a language and gives their meaning.");
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public String getDefinition(String word) {
        return dictionary.getOrDefault(word, "Word not found in the dictionary.");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Enter a word to get its definition (type 'exit' to quit): ");
            command = scanner.nextLine();
            if (!command.equalsIgnoreCase("exit")) {
                System.out.println(getDefinition(command));
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
        System.out.println("Thank you for using SimpleDictionary!");
    }

    public static void main(String[] args) {
        SimpleDictionary dictionary = new SimpleDictionary();
        dictionary.run();
    }
}
