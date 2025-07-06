import java.util.HashMap;
import java.util.Map;

//Learned:
//Create result variable to keep track of the answer for the max_frequency since its hard to get the key from the value
//Line: 26: Initialize count to 1 not 0
//Chcek if key exists: hash.containsKey(nums[i])
//Update/Put: hash.put(nums[i], 1)
//Get value from key: hash.get(nums[i])

public class majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int result = 0;
        int max_frequency = 0;
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                
                hash.put(nums[i], hash.get(nums[i])+1);
                if(max_frequency<hash.get(nums[i])){
                    max_frequency = hash.get(nums[i]);
                    result = nums[i];
                }
            }
            else{
                hash.put(nums[i], 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        majorityElement solution = new majorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};  // Example input
        int result = solution.majorityElement(nums);

        System.out.println("Majority element: " + result);  // Should print 2
    }
}

//Another version:
/*
public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int result = 0;
        int max_freq = 0;

        for(int i: nums){
            hash.put(i, hash.getOrDefault(i,0)+1);
            if(hash.get(i)>max_freq){
                result = i;
                max_freq = hash.get(i);
            }
        }

        return result;
    }
*/ 

//hash.getOrDefault(i,0)
//If key exists get i, else gets 0