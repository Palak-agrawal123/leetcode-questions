class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        int p=1;
        while(n>0){
            int val=n%10;
            sum+=val;
            if(val!=0){
                x=x+val*p;
                p*=10;
            }
            n/=10;
        }
        return x*sum;
    }
}