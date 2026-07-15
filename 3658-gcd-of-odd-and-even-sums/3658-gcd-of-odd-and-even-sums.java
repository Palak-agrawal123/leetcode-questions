class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e_sum=0;
        int o_sum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                e_sum+=i;
            }
            else{
                o_sum+=i;
            }
        }
        int a=e_sum;
        int b=o_sum;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;   
        }
        return a;

    }
}