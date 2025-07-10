import java.util.Arrays;

//Learned:
//rotated[(i+k) % nums.length] = nums[i]
public class rotateArray {
    public void rotate(int[] nums, int k) {
        //considers situation where k is greater than array length
        k = k % nums.length;
        int[] rotated = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            rotated[(i+k) % nums.length] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = rotated[i];
        }
    }
    public static void main(String[] args) {
        rotateArray solution = new rotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        System.out.println("Rotated array: " + Arrays.toString(nums));  
        // Output should be: [5, 6, 7, 1, 2, 3, 4]
    }
}
