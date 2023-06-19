class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int rev=0;
        while(temp>9){
            rev*=10;
            rev=rev+temp%10;
            temp=temp/10;
        }
        if(temp<10 && temp>0){
            rev*=10;
            rev+=temp;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}
