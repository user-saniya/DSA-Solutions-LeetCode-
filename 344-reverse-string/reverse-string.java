class Solution {
    private void reverseString(char []s,int low,int high){
     if(low>=high){
            return;
        }
            char swap=s[low];
            s[low]=s[high];
            s[high]=swap;
            reverseString(s,low+1,high-1);
    }
    public void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
       reverseString(s,low,high);
        }
        // int low=0;
        // int high=s.length-1;
        // while(low<high){
        // char temp=s[low];
        // s[low]=s[high];
        // s[high]=temp;
        // low++;
        // high--;
        // }
}