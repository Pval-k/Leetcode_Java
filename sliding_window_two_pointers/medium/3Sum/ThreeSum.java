import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Learned:
//Check j<k for the second while loop because the j++ before can make it go 

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int total = nums[i] + nums[j] + nums[k];
                if(total>0){
                    k--;
                }
                else if(total < 0){
                    j++;
                }
                else{
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(j<k && nums[j]== nums[j-1]){
                        j++;
                    }
                }

            }
        }
        return output;
    }
    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        int[] test1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.threeSum(test1);
        System.out.println("Test 1: " + result1);  // Expected: [[-1, -1, 2], [-1, 0, 1]]

        int[] test2 = {0, 1, 1};
        List<List<Integer>> result2 = solution.threeSum(test2);
        System.out.println("Test 2: " + result2);  // Expected: []

        int[] test3 = {0, 0, 0};
        List<List<Integer>> result3 = solution.threeSum(test3);
        System.out.println("Test 3: " + result3);  // Expected: [[0, 0, 0]]
    }
}
