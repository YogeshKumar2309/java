import java.util.HashSet;

public class ContainsDuplicate {

    /**
     * ?? Contains Duplicate :- Leetcode 217
     * ==> Given an integer array nums, return true if any value appears at least
     * twice in the array, and return false if every element is distinct.
     * 
     * nums : [1,4, 3,5,4] => true
     * nums : [1,4, 3,5] => false
     * 
     * 
     * =============================================
     * The approach explained for Contains Duplicate II (1:16:34) is an efficient
     * way to find if two identical numbers exist within a specific distance
     * .
     * 
     * Instead of checking every pair (which is slow), you can use a Hash Map and a
     * Sliding Window technique:
     * 
     * How it works: As you move through the list, you store each number and its
     * index in the Hash Map.
     * The Check: If you see a number that is already in your map, you calculate the
     * distance between its current index and the old index stored in the map.
     * The Result: If that distance is less than or equal to
     * , you have found your match and return True.
     * Efficiency: This method runs in
     * time because you only look at each number once, making it much faster than
     * the basic brute-force method.
     * 
     * 
     * 
     * 
     */


    public  boolean containsDuplicate(int[] nums) {
        // Create a hashSEt to storre element from the arary
        HashSet<Integer> seenNumbers = new HashSet<>();

        //Iterate through each element in the array
        for (int num : nums) {
            // Check if the element is already in the HashSet
            if (seenNumbers.contains(num)){
                return true; //Duplicate found
            }
            // Add the element to the HashSet
            seenNumbers.add(num);
        }

        return  false; // No duplicated found
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int [] arr = {1,2,3,4,5};
        boolean result = obj.containsDuplicate(arr);
        System.out.println(result);
    }

}
