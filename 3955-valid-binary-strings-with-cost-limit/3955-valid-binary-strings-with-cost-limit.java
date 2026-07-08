class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>ll=new ArrayList<>();
        
        solve(0,false ,"",0,ll,n,k);
        return ll;
    }
    public void solve(int idx,boolean isone,String s,int cost,List<String>ll,int n,int k){
        if(s.length()==n){
            ll.add(s);
            return ;
        }
        //add 0
        solve(idx+1,false,s+"0",cost,ll,n,k);
        //add 1
        if(!isone && cost+idx<=k){
            solve(idx+1,true,s+"1",cost+idx,ll,n,k);
        }
    }
}