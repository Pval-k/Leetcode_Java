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