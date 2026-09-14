public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
       String result="";

        for (int i = 0; i < s.length(); i++) {
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)&&result.length()<j-i+1){
                    result=s.substring(i,j+1);
                }

            }
        }

        return result;
    }

    private boolean isPalindrome(String str,int i,int j) {
        int left = i;
        int right = j;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}