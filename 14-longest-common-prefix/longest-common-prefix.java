class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String result=strs[0];
        int k=1;
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            int count=0;
            for(int j=0;j<s.length();j++){
                if(j<result.length()&&s.charAt(j)==result.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            result=result.substring(0,count);
        }
        return result;
    }
}