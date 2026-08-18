class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        String res = "";
        while(i >=0 || j>=0){
            int sum = carry;
            if(i>=0) sum+=Integer.parseInt(a.charAt(i--)+"");
            if(j>=0) sum+=Integer.parseInt(b.charAt(j--)+"");
            // System.out.println(sum);
            if(sum==3){
                res = "1"+res;
                carry = 1;
            }
            else if(sum==2){
                res = "0" + res;
                carry = 1;
            }
            else if(sum==1){
                res="1"+res;
                carry = 0;
            }
            else{
                res = "0"+res;
            }
        }
        if(carry>0) res = carry + res;
        return res;
    }
}
