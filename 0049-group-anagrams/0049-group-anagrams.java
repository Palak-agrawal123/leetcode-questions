class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //     boolean flag[]=new boolean[strs.length];
    //     List<List<String>>ans=new ArrayList<>();
    //     for(int i=0;i<strs.length;i++){
    //         if(flag[i]==true){
    //             continue;
    //         }
    //         List<String>ll=new ArrayList<>();
    //         ll.add(strs[i]);
    //         for(int j=i+1;j<strs.length;j++){
    //             if(flag[j]==true) continue;
    //             if(isAna(strs[i],strs[j])){
    //                 ll.add(strs[j]);
    //                 flag[j]=true;
    //             }
    //         }
    //         ans.add(ll);
    //     }
    //     return ans;
    // }
    // public boolean isAna(String s1,String s2){
    //     String ar1[]=s1.split("");
    //     String ar2[]=s2.split("");
    //     Arrays.sort(ar1);
    //     Arrays.sort(ar2);
    //     if(Arrays.equals(ar1,ar2)){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char []arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        for(var e :map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;

    }
}