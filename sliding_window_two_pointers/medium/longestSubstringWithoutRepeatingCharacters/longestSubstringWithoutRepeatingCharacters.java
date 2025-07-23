import java.util.HashSet;
public class longestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int A = 0;
        int max_length = 0;

        for(int B = 0; B < s.length(); B++){
            while(charSet.contains(s.charAt(B))){
                charSet.remove(s.charAt(A));
                A++;
            }

            charSet.add(s.charAt(B));
            max_length = Math.max(max_length, B-A+1);
        }
        return max_length;

    }
    public static void main(String[] args) {
        longestSubstringWithoutRepeatingCharacters solution = new longestSubstringWithoutRepeatingCharacters();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Expected: 3 ("abc")
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // Expected: 1 ("b")
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // Expected: 3 ("wke")
        System.out.println(solution.lengthOfLongestSubstring(""));         // Expected: 0 (empty string)
        System.out.println(solution.lengthOfLongestSubstring("au"));       // Expected: 2 ("au")
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));     // Expected: 3 ("vdf")
    }
}
