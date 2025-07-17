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
