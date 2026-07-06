class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int count=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                y+=1;
            }
            else if(ch=='D'){
                y-=1;
            }
            else if(ch=='L'){
                x-=1;
            }
            else if(ch=='R'){
                x+=1;
            }
            else{
            count++;
            }
        }
        int ans=Math.abs(0-x)+Math.abs(0-y);
        return ans+count;
        
    }
}