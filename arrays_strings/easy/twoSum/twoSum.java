import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Learned:
//To create new array directly: new int[] {i, hash.get(target-num)};
//Create HashMap: Map<Integer, Integer> hash = new HashMap<>();

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int value = target-num;
            if(hash.containsKey(value)){
                return new int[]{i,hash.get(value)};
            }
            else{
                hash.put(num,i);
            }

        }

        return nums;
    }

    //Check
    public static void main(String[] args) {
        // Create an object of the class
        twoSum solution = new twoSum();

        // Call the method using the object
        int[] result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);

        // Print result
        System.out.println(Arrays.toString(result)); 
    }
}

