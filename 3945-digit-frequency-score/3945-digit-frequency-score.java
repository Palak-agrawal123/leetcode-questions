class Solution {
    public int digitFrequencyScore(int n) {
        String s=Integer.toString(n);
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        int sum=0;
        int freq=1;
        int f=0;
        char p_ele='0';
        char n_ele='0';
        if(arr.length==1){
            return arr[0]-'0';
        }
        for(int i=0;i<arr.length-1;i++){
            p_ele=arr[i];
            n_ele=arr[i+1];
            
            if(arr[i]==arr[i+1]){
                f=0;
                freq++;
            }
            else{
                sum+=((arr[i]-'0')*freq);
                freq=1;
                f=1;
            }
        }
        if(f==0){
        sum+=((p_ele-'0')*freq);
        }
        else{
            sum+=((n_ele-'0')*freq);
        }
        return sum;
    }
}