//Learned:
//We can shorten checking if current volume is better than max volume in one line(Line: 15)
//Don't need to check if height.length is 2,1, or 0;
//Math.max: returns max 

public class containerWithMostWater {
    public int maxArea(int[] height) {
        int A = 0;
        int B = height.length - 1;
        int max_volume = 0;

        while (A < B) {
            int width = B - A;
            int minHeight = Math.min(height[A], height[B]);
            max_volume = Math.max(max_volume, width * minHeight);

            if (height[A] < height[B]) {
                A++;
            } else {
                B--;
            }
        }

        return max_volume;
    }
    public static void main(String[] args) {
        containerWithMostWater solution = new containerWithMostWater();

        // Test cases
        int[][] testCases = {
            {1,8,6,2,5,4,8,3,7},    // Expected: 49
            {1,1},                 // Expected: 1
            {4,3,2,1,4},           // Expected: 16
            {1,2,1},               // Expected: 2
            {2,3,10,5,7,8,9},      // Expected: 36
            {1},                   // Expected: 0
            {},                    // Expected: 0
            {5,5,5,5,5}            // Expected: 20
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = solution.maxArea(testCases[i]);
            System.out.println("Test case " + (i+1) + ": " + result);
        }
    }
}

/* My code without shortening it:
 * public int maxArea(int[] height) {
        int A = 0;
        int B = height.length-1;
        int max_volume = 0;

        if(height.length <= 1 ){
            return 0;
        }
        else if(height.length == 2){
            return Math.min(height[A],height[B]);
        }

        while(A < B){
            int x = B-A;
            int y = Math.min(height[A],height[B]);
            int current_volume = x*y;

            if(current_volume > max_volume){
                max_volume = current_volume;
            }
            if (height[A] > height[B]) {
                B--;
            } else if (height[B] > height[A]) {
                A++;
            }
            else{
                A++;
            }

        }
        return max_volume;
        
    }
 */
