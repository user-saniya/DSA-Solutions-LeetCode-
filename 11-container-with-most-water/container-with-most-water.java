class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int area=0;
        int len=0;
        int breadth=height.length-1;
    while(len<breadth){
        if(height[len]>=height[breadth]){
          area=height[breadth]*(breadth-len);
          breadth--;
        }
        else{
            area=height[len]*(breadth-len);
            len++;
        }
        maxarea=Math.max(area,maxarea);
    }
     return maxarea;
    }
}