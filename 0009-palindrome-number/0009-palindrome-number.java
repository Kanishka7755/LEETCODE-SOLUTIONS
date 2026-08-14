class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int org=x;
        while(x>0){
            int r=x%10;
            num=num*10+r;
            x=x/10;
        }
        if(org==num){
            return true;
        }else{
            return false;
        }
        
    }
}