class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9)
         {
            digits[digits.length-1]+=1;
         }
         else
         {
            for(int i=digits.length-1;i>=0;i--){
                if(i!=0 && digits[i]==9){
                    digits[i]=0;
                }
                else if(i==0) {
                    if(digits[i]<9){
                        digits[i]+=1;
                    }
                    else{
                        int[] finalArr = new int[digits.length+1];
                        finalArr[0] = 1;
                        return finalArr;
                    }
                }
                else{
                    digits[i]+=1;
                    break;
                }
            }
         }
         return digits;
    }
}
