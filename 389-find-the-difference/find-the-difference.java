class Solution {
    public char findTheDifference(String s, String t) {
         HashMap<Character,Integer>map=new HashMap<>();
         int total=0;
         for(char ch:t.toCharArray()){
           total+=ch;
         }
         char ans;
         for(char ch:s.toCharArray()){
            total-=ch;
           }
           return (char)total;
    }
}