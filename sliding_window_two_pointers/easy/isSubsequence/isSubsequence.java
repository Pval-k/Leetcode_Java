//Learned:
//While loop must check both strings for the bounds

//Reminder: String length is with parenthesis .length()
//Reminder: Must do .equals not == between strings 

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int A = 0;
        int B = 0;

        while(A < s.length() && B < t.length()){
            if((s.substring(A,A+1)).equals(t.substring(B,B+1))){
                A++;
                B++;
            }
            else{
                B++;
            }
        }
        if(A == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        isSubsequence checker = new isSubsequence();

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("\"" + s1 + "\" is a subsequence of \"" + t1 + "\": " + checker.isSubsequence(s1, t1)); // true

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("\"" + s2 + "\" is a subsequence of \"" + t2 + "\": " + checker.isSubsequence(s2, t2)); // false

        String s3 = "";
        String t3 = "anything";
        System.out.println("\"" + s3 + "\" is a subsequence of \"" + t3 + "\": " + checker.isSubsequence(s3, t3)); // true
    }
}

/* Condensed solution:

     public boolean isSubsequence(String s, String t) {
        int A = 0;
        int B = 0;

        while (A < s.length() && B < t.length()) {
            if (s.substring(A, A + 1).equals(t.substring(B, B + 1))) {
                A++;
            }
            B++;
        }

        System.out.println("Matched characters: " + A);
        return A == s.length();
    }

 */