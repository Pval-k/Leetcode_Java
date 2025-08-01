import java.util.Arrays;


public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
    }
    public static void main(String[] args) {
        removeDuplicatesFromSortedArray solution = new removeDuplicatesFromSortedArray();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};  // Sample input
        int length = solution.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums, 0, length)));
    }
}


















//Learned:
//Because we are updating A+1, we need to return A+1 


/*
 * int A = 0;
        int B = 0;

        while(B < nums.length){
            if(nums[A] == nums[B]){
                B++;
            }
            else{
                nums[A+1] = nums[B];
                A++;
                B++;
            }
        }
        return A+1;
 */