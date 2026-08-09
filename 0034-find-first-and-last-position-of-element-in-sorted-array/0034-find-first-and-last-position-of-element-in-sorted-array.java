class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=binarysearch(nums,target,true);
        int right=binarysearch(nums,target,false);
        return new int[]{left,right};
    }
    public int binarysearch(int[]nums,int target,boolean searching_left){
        int left=0;
        int right=nums.length-1;
        int idx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                idx=mid;
                if(searching_left){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return idx;
    }
}