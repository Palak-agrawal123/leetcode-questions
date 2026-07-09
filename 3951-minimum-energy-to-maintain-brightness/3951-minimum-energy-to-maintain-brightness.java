class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
        long start=intervals[0][0];
        long end=intervals[0][1];
        long active=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end+1){
                end=Math.max(intervals[i][1],end);
            }
            else{
                active+=end-start+1;
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        active+=end-start+1;
        //min bulbs
        long covered=-1;
        long bulbs=0;
        while(covered+1<brightness){
            long next=covered+1;
            long bulb=Math.min(next+1,n-1);
            bulbs++;
            covered=Math.min(n-1,bulb+1);
        }
        return active*bulbs;
    }
}