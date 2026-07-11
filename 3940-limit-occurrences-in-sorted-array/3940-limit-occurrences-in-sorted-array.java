class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer>ll=new ArrayList<>();
        int c=1;
        int f=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
                f=0;
            }
            else{
                f=1;
                for(int j=1;j<=Math.min(c,k);j++){
                        ll.add(nums[i]);
                    }
                c=1;
            }
        }
        if(f==0){
            for(int j=1;j<=Math.min(c,k);j++){
                ll.add(nums[nums.length-1]);
            }
        }
        else ll.add(nums[nums.length-1]);
        int arr[]=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}