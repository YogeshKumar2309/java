import java.util.Arrays;

/**
 * . ProductOfArrayExceptSelf
 * 
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i]
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer
 * 
 * Yor must write an algorithm that runs in o(n) time and without using the
 * division operation.
 * 
 * eg. :
 * Input: nums: [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        Arrays.fill(result, 1);
        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = postfix * result[i];
            postfix = postfix * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        int[] nums = { 1, 2, 3, 4 };
        int[] result = obj.productExceptSelf(nums);
        
        for (int num:result){
            System.out.println(num);
        }
    }
}