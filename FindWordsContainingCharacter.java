import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindWordsContainingCharacter {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();

    public static String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }


    // Using Dynamic Array
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
           
            for (char c : words[i].toCharArray()) {
                if (c == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindWordsContainingCharacter finder = new FindWordsContainingCharacter();

        //Đoạn này để cháu in thời gian chạy
        for (int n = 1000; n <= 10000; n += 1000) {
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = generate(6);
    
            }

            long start = System.nanoTime();
            List<Integer> result = finder.findWordsContaining(words, 'd');
            long end = System.nanoTime();
            System.out.println(" Input size: " + n + " - Time: " + (end - start) / 1_000_000.0 + " ms");
        }
    }

}
