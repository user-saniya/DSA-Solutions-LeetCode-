class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=Integer.MIN_VALUE;
        Set<Character>set=new HashSet<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(set.contains(ch)){
                while(start<end&&set.contains(ch)){
                    set.remove(s.charAt(start));
                    start++;
                }
            }
            set.add(ch);
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return (maxlen==Integer.MIN_VALUE)?0:maxlen;
    }
}