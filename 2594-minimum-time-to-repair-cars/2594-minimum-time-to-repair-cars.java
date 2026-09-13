class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n=ranks.length;
        long lo=1;
        long hi=Integer.MAX_VALUE;
        long ans=0;
        for(int i=0;i<n;i++){
            hi=Math.min(hi,ranks[i]);
        }
        hi=hi*cars*cars;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(isrepair(mid,ranks,cars)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isrepair(long mid,int []ranks,int cars){
        long totalcars=0;
        for(int i=0;i<ranks.length;i++){
            totalcars+=Math.sqrt(mid/ranks[i]);
        }
        if(totalcars>=cars){
            return true;
        }
        else{
            return false;
        }
    }
}