import java.util.HashSet;

public class ContainsDuplicate2 {

    /**
     * ?? Contains Duplicate II :- Leetcode 219
     * 
     * Given an integer array nums and an integer k, return true if there are two
     * distinct indices i and j in the array such that nums[i] == nums[j] and
     * abs(i-j) <= k.
    * 
     * 
     * 
     * ================================
     * The problem discussed at (1:16:34) is LeetCode 219: Contains Duplicate II.
     * 
     * The Question:
     * Given an integer array nums and an integer k, you need to determine if there
     * are two distinct indices i and j in the array such that nums[i] == nums[j]
     * and the absolute difference between their indices is at most k (i.e., abs(i -
     * j) <= k).
     * 
     * The Approach:
     * Instead of a brute-force approach (comparing every possible pair, which is
     * slow), the video demonstrates an efficient solution using a Hash Map:
     * 
     * Store and Track: As you iterate through the array, use a hash map to store
     * each number as the key and its most recent index as the value.
     * Look for Matches: For every new element you encounter, check if it already
     * exists in your hash map.
     * Check the Distance: If the number is found in the map, calculate the
     * difference between the current index and the index stored in the map. If this
     * difference is less than or equal to k, you have found a valid pair and can
     * return true.
     * Update: If the number isn't found or the condition isn't met, update the hash
     * map with the current number and its index so you are always tracking the most
     * recent position.
     * Efficiency:
     * This approach runs in O(n) time complexity, as you only need to traverse the
     * array once, making it much faster than nested loops.
     */

    public boolean containsNearbyDuplicate(int[] nums, int k)  {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

            if(set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 obj = new ContainsDuplicate2();

        int[] nums = {1,2,3,4,1,5,6};
        int k = 3;
        boolean result = obj.containsNearbyDuplicate(nums,k);
        System.out.println(result);
    }

}
