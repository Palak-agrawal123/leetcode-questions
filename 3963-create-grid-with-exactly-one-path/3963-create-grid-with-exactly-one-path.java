class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr=new String[m];
        int k=0;
        for(int i=1;i<=m;i++){
            String s="";
            if(i==m){
                for(int j=1;j<=n;j++){
                    s+='.';
                }  
            }
            else{
                s+='.';
                for(int j=2;j<=n;j++){
                    s+='#';
                }
            }
            arr[k++]=s;
            
        }
        return arr;
    }
}