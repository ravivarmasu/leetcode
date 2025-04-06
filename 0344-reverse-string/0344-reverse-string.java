class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right=s.length-1;
        while(left<right){
            char r=s[right];
            s[right]=s[left];
            s[left]=r;
            left++;
            right--;
        }

    }
}