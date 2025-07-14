//Learned:
//String can have odd number of letters so must do A<B in while loop
//Must check if character is not a letter first. Because if one is a space one is a letter, we must check the next character
//Character at index: s.charAt(A)
//If character is letter or digit: Character.isLetterOrDigit

public class validPalindrome {
    public boolean isPalindrome(String s) {
        int A = 0;
        int B = s.length()-1;
        while(A<B){
            if(s.substring(A,A+1).equals(s.substring(B,B+1))){
                A++;
                B--;
            }
            else{
                if(!Character.isLetterOrDigit(s.charAt(A))){
                    A++;
                }
                else if(Character.isLetterOrDigit(s.charAt(B))){
                    B--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        validPalindrome checker = new validPalindrome();

        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = "0P";

        System.out.println("\"" + input1 + "\" → " + checker.isPalindrome(input1)); // true
        System.out.println("\"" + input2 + "\" → " + checker.isPalindrome(input2)); // false
        System.out.println("\"" + input3 + "\" → " + checker.isPalindrome(input3)); // false
    }
}
