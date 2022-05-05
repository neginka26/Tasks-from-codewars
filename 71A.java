import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n+1; i++) {
            String word = scanner.nextLine();
            int wordSize = word.length();
            if (wordSize > 10) {
                String abbreviatedWord = word.substring(0, 1) + String.valueOf(wordSize - 2) + word.substring(wordSize - 1,wordSize);
                System.out.println(abbreviatedWord);
            } else {
                System.out.println(word);
            }
        }

    }
}
