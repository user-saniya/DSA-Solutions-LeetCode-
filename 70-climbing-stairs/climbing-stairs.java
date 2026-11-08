class Solution {
    public int climbStairs(int n) {
       // Map<Integer, Integer> memo = new HashMap<>();
        //return climbStairs(n, memo);
        if(n<=2){
            return n;
        }/*
        int []arr=new int [n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];*/
        int prev1=1;
        int prev2=2;
        for(int i=3;i<=n;i++){
            int sum=prev1+prev2;
            prev1=prev2;
            prev2=sum;
        }
        return prev2;
     //   if(n<=2)return n;
      //  else return climbStairs(n-1)+climbStairs(n-2);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}