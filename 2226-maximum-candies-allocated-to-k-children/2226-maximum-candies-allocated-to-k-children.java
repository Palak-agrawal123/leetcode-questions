class Solution {
    public int maximumCandies(int[] candies, long k) {
        int lo=1;
        int hi=0;
        for(int candy : candies){
            hi=Math.max(candy,hi);
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long max_candy=0;
            for(int candy :candies){
                max_candy += candy / mid;
            }
            if(max_candy>=k){
                    ans=mid;
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            
        }
        return ans;

    }
}