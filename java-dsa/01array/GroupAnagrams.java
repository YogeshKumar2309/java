import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    /**
     * Leetcode 49 problem
     * 
     * Givnen an arary of strings stars, group the anagrams together. You can return
     * the answer in any order .
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * diffrent word or phrase, typically using all the original letters exactly
     * once.
     * 
     * eg 1:
     * 
     * Input: strs = ["eat","tea","tan","ate","nat","bat"];
     * Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> ansMap = new HashMap<>();

        int[] count = new int[26];

        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList<>());
            }

            ansMap.get(key).add(s);
        }

        return new ArrayList<>(ansMap.values());

    }

    public static void main(String[] args) {
        GroupAnagrams obj = new  GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>  result  = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}
