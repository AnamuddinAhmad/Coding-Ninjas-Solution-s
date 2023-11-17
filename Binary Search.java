public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int start=0;
        int end=nums.length-1;
       
        while (start<=end) {
        int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
               
        //     }
        // }
        return -1;
    }
}
