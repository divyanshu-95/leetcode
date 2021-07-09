class Solution {
    public void reverseString(char[] s) {
        // for(int i=s.length-1;i>=0;i--)
            // return i;
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[right];
            s[right--]=s[left];
            s[left++]=temp;
        }
    }
}
