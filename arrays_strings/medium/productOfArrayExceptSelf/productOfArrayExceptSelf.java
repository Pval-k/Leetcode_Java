import java.util.Arrays;

public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = 1;
        }

        int left = 1;
        for(int i = 0; i < n; i++){
            res[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for(int i = n-1; i >= 0; i--){
            res[i]  *= right;
            right *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        productOfArrayExceptSelf solution = new productOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};  // Example input
        int[] result = solution.productExceptSelf(nums);

        System.out.println("Product of array except self: " + Arrays.toString(result));
        // Expected Output: [24, 12, 8, 6]
    }
}
