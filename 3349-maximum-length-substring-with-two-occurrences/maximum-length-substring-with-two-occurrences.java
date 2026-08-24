class Solution {
    public int maximumLengthSubstring(String s) {
      int j=0;
      int count=0;
      HashMap<Character,Integer>map=new HashMap<>();
        for( int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
         map.put(s.charAt(j),map.get(s.charAt(j))-1);
         j++; 
            }
        count=Math.max(count,i-j+1);
      } 
        return count;
    }
}