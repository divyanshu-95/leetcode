class Solution {
    public int reverse(int x) {
        int reverse=0;
        while(x!=0){
            int rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
        }
        return reverse;
    }
}
