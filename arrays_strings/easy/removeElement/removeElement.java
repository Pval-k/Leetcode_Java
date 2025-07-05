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

        int result = solution.removeElement(new int[] { 3,2,2,3 }, 3);

        System.out.println(result);  
    }
}