import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Leetcode 269. VerifyingAlienDictionary
 * 
 * In an alien language, surprisingly, they also use English lowercase latters,
 * but possibly in a different order. The order of the alpahbet is some
 * permutation of lowercase latters.
 * 
 * Given a sequence of words written in the alien language, and the order of the
 * alphabet, return true if and only if the given words are sorted
 * lexicographically in this alien language.
 * 
 * eg.1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwzyz"
 * output: true
 * explanation: As 'h' comes before 'l' in this language, then the sequence is
 * sorted.
 * 
 * eg.2:
 * Input: words=["word","world", "row"], order="worldabcefghijkmnpqstuvxyz"
 * Oputput: false
 * Explanation: As 'd' comes after 'l' in this language, then wrods[0] >
 * words[1], hence the sequence is unsorted.
 */
public class VerifyingAlienDictionary {

    public Map<Character, List<Character>> reversedList = new HashMap<>(); // Graph store karta hai.
    public Map<Character, Boolean> seen = new HashMap<>(); // Character ki DFS state rakhta hai.
    public StringBuilder result = new StringBuilder();

    public String alienOrder(String[] words) {

        for (String word : words) {
            for (char c : word.toCharArray()) {
                reversedList.putIfAbsent(c, new ArrayList<>());
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    reversedList.get(word2.charAt(j)).add(word1.charAt(j));
                    break;
                }
            }
        }

        for (Character c : reversedList.keySet()) {
            boolean res = dfs(c);
            if (!res)
                return "";
        }

        if (result.length() < reversedList.size()) {
            return "";
        }

        return result.toString();

    }

    public boolean dfs(Character c) { // dfs = Depth-First Search
        if (seen.containsKey(c)) {
            return seen.get(c);
        }
        seen.put(c, false);

        for (Character next : reversedList.get(c)) {
            boolean res = dfs(next);
            if (!res)
                return false;
        }

        seen.put(c, true);
        result.append(c);
        return true;
    }

    public static void main(String[] args) {

    }

}
