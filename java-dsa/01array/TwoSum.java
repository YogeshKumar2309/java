import java.util.HashMap;

public class TwoSum {

    //Two  Sum :- Letcode1
    /** Given an arary of integers nums and an integer target, return indices of two numbers such that they add up to target.
     * You may assumme that each input would have exactly one solution, and you may not use the same element twice. 
     * You can return the answer in any order
     * 
     * 
     * nums = [2, 7, 11, 15]
     * target = 9
     * 
     * 
     * 
     * 
     * The Two Sum problem is a classic coding challenge where you are given an array of numbers and a target value, and you must return the indices of the two numbers that add up to that target (0:59:25).

Solving Methods:
Brute Force Approach:

You use a nested loop to check every possible pair of numbers in the array to see if their sum matches the target (1:00:36).
This is straightforward but inefficient, as it results in a time complexity of 
.
Optimal Approach (Using a Hash Map):

Instead of checking every pair, you iterate through the array once and store each number's value and its index in a hash map (often called a dictionary).
For each number 
, you check if the complement (target - 
) already exists in the map.
If it exists, you have found the solution instantly.
If not, you add the current number to the map and continue.
This method is much faster, achieving 
 time complexity because lookups in a hash map are constant time (1:20:54).



//==========================================================================


 The **Two Sum** problem ek classic coding challenge hai, jisme tumhe numbers ki ek array aur ek target value di jaati hai, aur tumhe un do numbers ke **indices return karne hote hain** jinka sum target ke equal ho. (0:59:25)

### Solving Methods:

1. **Brute Force Approach:**

   * Tum ek **nested loop** ka use karke array ke har possible pair of numbers ko check karte ho, taaki pata chal sake ki unka sum target ke equal hai ya nahi. (1:00:36)
   * Ye approach straightforward hai, lekin inefficient hai, kyunki iski **time complexity O(n²)** hoti hai.

2. **Optimal Approach (Using a Hash Map):**

   * Har pair ko check karne ke bajay, tum array ko **sirf ek baar iterate** karte ho aur har number ki **value aur uski index** ko ek **hash map** mein store karte ho.
   * Har number `x` ke liye tum check karte ho ki uska **complement `(target - x)`** map mein pehle se exist karta hai ya nahi.
   * Agar exist karta hai, to tumne solution find kar liya.
   * Agar exist nahi karta, to tum current number ko map mein add karte ho aur aage continue karte ho.
   * Ye method kaafi fast hai aur **O(n) time complexity** achieve karta hai, kyunki hash map mein lookup average **constant time O(1)** hota hai. (1:20:54)

    */


    public int[] twoSum(int[] numbers, int target) {

        // Create a hashmap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate throgh the array
        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[]{map.get(complement), i};
            }

            // Otherwise , add the curent number and its index to the map
            map.put(numbers[i], i);
        }

        // Return an empty array if no solution is found ( this case won't occur as per problem constarinsts )
        // return new int[] {};
        return null;
    }


    public static int[] towSum2(int[] numbers, int target) {
        
        HashMap <Integer, Integer>  map = new HashMap<>();

        for (int i = 0; i < numbers.length ; i++){
        int complement = target - numbers[i];

        if(map.containsKey(complement)){
            return new int[] {map.get(complement),i};
        }

        map.put(numbers[i], i);

        }

        return new int[] {}; 
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 7, 11, 15};
        int target = 9;

        TwoSum obj = new TwoSum();

        int[] result = obj.twoSum(arr, target);

        System.out.println(result[0] + ", " + result[1]);

        //twoSum2
        int[] result2 = towSum2(arr, target);
           System.out.println("result 2 => " + result2[0] + ", " + result2[1]);
    }
}