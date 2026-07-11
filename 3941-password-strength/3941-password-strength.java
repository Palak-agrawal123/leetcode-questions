class Solution {
    public int passwordStrength(String password) {
        int n=password.length();
        List<Character>ll=new ArrayList<>();
        char ans[]=password.toCharArray();
        Arrays.sort(ans);
        ll.add(ans[0]);
        for(int i=0;i<ans.length-1;i++){
            if(ans[i]!=ans[i+1]){
                ll.add(ans[i+1]);
            }
        }
        int c=0;
        for(int i=0;i<ll.size();i++){
            char ch=ll.get(i);
            if(ch>='a' && ch<='z'){
                c+=1;
            }
            else if(ch>='A' && ch<='Z'){
                c+=2;
            }
            else if(ch>='0' && ch<='9'){
                c+=3;
            }
            else {
                c+=5;
            }
            
        }
        return c;
    }
}