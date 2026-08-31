class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            hi=Math.max(hi,piles[i]);
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(ispossible(mid,piles,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int mid,int[]arr,int h){
        int c=0;
        for(int i=0;i<arr.length;i++){
    
            c += (arr[i] + mid - 1) / mid; 
            if(c>h){
                return false;
            }
            
        }
        return true;
    }
}