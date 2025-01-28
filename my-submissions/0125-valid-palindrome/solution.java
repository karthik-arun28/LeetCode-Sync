class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll(" ", "").toLowerCase();
        System.out.println(s);
        int j = s.length()-1;
        int i = 0;
        while(i<s.length() && j>=0){
            int a = (int) s.charAt(i);
            int b = (int) s.charAt(j);
            if((a>=48 && a<=57) || (a>=97 && a<=122)){
                if((b>=48 && b<=57) || (b>=97 && b<=122)){
                    if(s.charAt(i) != s.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return true;
    }
}
