class Solution {
    public String reverseOnlyLetters(String s) {
        char[]ch=s.toCharArray();
        int low=0;
        int high=ch.length-1;
        while(low<high){
            if(!Digit(ch[low])){
                low++;
            }
           else  if(!Digit(ch[high])){
                high--;
            }
            else{
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;
                low++;
                high--;
            }
        }
        return String.valueOf(ch);
    }
    private boolean Digit(char ch){
     if(Character.isLetter(ch)){
        return true;
     }
     return false;
    }
}