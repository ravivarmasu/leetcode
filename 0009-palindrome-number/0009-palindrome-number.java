class Solution {
    public boolean isPalindrome(int n) {
       int sum=0;
       int x=n;
       if(n<0){
        return false;
       }
       while(n!=0) {
        int d=n%10;
        sum=sum*10+d;
        n=n/10;
       }
       if(x==sum){
        return true;
       }else{
        return false;
       }
    }
}