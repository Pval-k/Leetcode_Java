import java.util.Arrays;

//Learned:
//If B isn't value: move pointers, else: move B

public class removeElement {
    public int removeElement(int[] nums, int val) {
        int A = 0;
        int B = 0;

        while(B<nums.length){
            if(nums[B] != val){
                nums[A] = nums[B];
                A++;
                B++;
            }
            else{
                B++;
            }
            
            
        }
        return A; 
    }

    public static void main(String[] args) {
        removeElement solution = new removeElement();

        int[] nums = {3, 2, 2, 3};  
        int val = 3;               

        int length = solution.removeElement(nums, val);

        System.out.println("New length after removing " + val + ": " + length);
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOfRange(nums, 0, length)));
    }
}