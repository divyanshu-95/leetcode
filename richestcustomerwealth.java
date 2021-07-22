class Solution {
    public int maximumWealth(int[][] accounts) {
        int l=accounts.length;
        if(l==0){
            return 0;
        }
        int a=accounts[0].length;
        int ans=0;
        for(int i=0;i<l;i++){
            int res=0;
            for(int j=0;j<a;j++){
                res+=accounts[i][j];
            }
            ans=Math.max(ans,res);
        }
        return ans;
    }
}
