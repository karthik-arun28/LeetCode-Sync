class Solution {
    public String reverseVowels(String s) {
        String[] chArr = s.split("");
        int i = 0;
        int j = chArr.length - 1;
        while(i<j){
            String temp = chArr[j].toLowerCase();
            if(temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u")){
                boolean flag = true;
                while(flag && i!=j){
                    String temp1 = chArr[i].toLowerCase();
                    if(temp1.equals("a") || temp1.equals("e") || temp1.equals("i") || temp1.equals("o") || temp1.equals("u")){
                        String temp2 = chArr[i];
                        chArr[i] = chArr[j];
                        chArr[j] = temp2;
                        i++;
                        j--;
                        flag=false;
                    }
                    else{
                        i++;
                    }
                }
            }
            else{
                j--;
            }
        }
        return String.join("", chArr);
    }
}
