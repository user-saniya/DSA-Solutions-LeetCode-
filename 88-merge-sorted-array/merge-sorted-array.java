class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i=0,j=0,k=0;
         int [] arr=new int[n+m];
         while(i<m&&j<n){
           if(nums1[i]<=nums2[j]){
            arr[k]=nums1[i];
            i++;
            k++;
           }
           else{
            arr[k]=nums2[j];
            j++;
            k++;
           }
         }
         while(i<m){
            arr[k]=nums1[i];
            k++;
            i++;
         }
         while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
         }
         for(i=0;i<m+n;i++){
            nums1[i]=arr[i];
         }
        
    }
}