public class minimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min_length = nums.length + 1;
        int curr_sum = 0;

        for (int right = 0; right < nums.length; right++) {
            curr_sum += nums[right];

            while (curr_sum >= target) {
                min_length = Math.min(min_length, right - left + 1);
                curr_sum -= nums[left];
                left++;
            }
        }

        if (min_length == nums.length + 1) {
            return 0;
        } else {
            return min_length;
        }
    }

    public static void main(String[] args) {
        minimumSizeSubarraySum sol = new minimumSizeSubarraySum();

        // Test cases
        int result1 = sol.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        int result2 = sol.minSubArrayLen(4, new int[]{1, 4, 4});
        int result3 = sol.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        int result4 = sol.minSubArrayLen(15, new int[]{5, 1, 3, 5, 10, 7, 4, 9, 2, 8});

        // Output results
        System.out.println("Test Case 1: Expected 2, Got " + result1);
        System.out.println("Test Case 2: Expected 1, Got " + result2);
        System.out.println("Test Case 3: Expected 0, Got " + result3);
        System.out.println("Test Case 4: Expected 2, Got " + result4);
    }
}
