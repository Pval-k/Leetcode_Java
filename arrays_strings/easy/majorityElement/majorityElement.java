import java.util.HashMap;
import java.util.Map;


//Learned:
//Set majority_element to nums[0]: If the array has one element, majority_element isn’t updated since updates happen only when the key exists.
//Can't use Math.max for max_frequency because we need to go into the condition to update majority_element
//You can get value from key but not key from value
public class majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int max_frequency = 0;
        int majority_element = nums[0];
        
        for(int num : nums){
            if(hash.containsKey(num)){
                hash.put(num, hash.get(num)+1);
                if(max_frequency < hash.get(num)){
                    max_frequency = hash.get(num);
                    majority_element = num;
                }
            }
            else{
                hash.put(num,1);
            }
        }

        return majority_element;

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



//Learned:
//Create result variable to keep track of the answer for the max_frequency since its hard to get the key from the value
//Line: 26: Initialize count to 1 not 0
//Check if key exists: hash.containsKey(nums[i])
//Update/Put: hash.put(nums[i], 1)
//Get value from key: hash.get(nums[i])

/*
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
 */