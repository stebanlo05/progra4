import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int wordCount = countWords(sentence);
        System.out.println("The number of words in the sentence is: " + wordCount);
        
        scanner.close();
    }

    static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
