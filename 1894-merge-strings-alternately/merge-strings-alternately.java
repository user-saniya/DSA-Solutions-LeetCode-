class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i;
        int j=0;
        for( i=0;i<word1.length()&&j<word2.length();i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            j++;
        } 
        while(i<word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}