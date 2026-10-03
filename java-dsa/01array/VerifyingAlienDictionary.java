
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Leetcode 953. VerifyingAlienDictionary
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

    public static boolean isAlienSorted(String[] words, String order){

        Map<Character,Integer> orderMap = new HashMap<>();

        for(int i=0; i<order.length(); i++){
            orderMap.put(order.charAt(i),i);
        }

        for(int i=0; i<words.length-1;i++){
            for(int j=0; j<words[i].length(); j++){
                
                if(j >= words[i+1].length()){
                    return false;
                }

                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i+1].charAt(j));
                    if(nextLetter < currLetter){
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }

        return true;

    }
  
    public static void main(String[] args) {
        String[] words = {"apple", "ball"};
        String order = "hlabcdefgijkmnopqrstuvwzyz";

        boolean result = isAlienSorted(words, order);
        System.out.println(result);
    }

}



     //testing git 