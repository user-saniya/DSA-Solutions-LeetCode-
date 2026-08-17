class Solution {
    public int totalFruit(int[] fruits) {
        int count=0;
        int j=0;
    int     ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[j],map.getOrDefault(fruits[j],0)-1);
                if(map.get(fruits[j])==0){
                    map.remove(fruits[j]);
                }
                j++;
            }
           ans=Math.max(ans,i-j+1);
        }
    return ans;
    }
}