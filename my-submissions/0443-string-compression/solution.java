class Solution {

    public static int k =0;
    public int compress(char[] chars) {
        Solution.k =0;
        // System.out.println(countArr);
        char c = chars[0];
        int count = 0;
        for(char i: chars){
            if(c==i){
                count++;
            }  
            else{
                if(count>0){
                    if(count==1){
                        chars[Solution.k] = c;
                        Solution.k++;
                    }
                    else if(count < 10){
                        chars[Solution.k++] = c;
                        chars[Solution.k++] = (char) (count+'0');
                    }
                    else{
                        chars[Solution.k++] = c;
                        int temp = count;
                        calMod(temp, chars);
                    }
                }
                count = 0;
                c = i;
                count++;
            }

        }

        if(count>0){
                    if(count==1){
                        chars[Solution.k] = c;
                        Solution.k++;
                    }
                    else if(count < 10){
                        chars[Solution.k++] = c;
                        chars[Solution.k++] = (char) (count+'0');
                    }
                    else{
                        chars[Solution.k++] = c;
                        int temp = count;
                        // System.out.println(Solution.k);
                        calMod(temp, chars);
                    }
                }
        // System.out.println(Solution.k);
        return Solution.k;
    }

    private int calMod(int t, char[] chars){
        if(t/10<10){
            chars[Solution.k++] = (char) (((t/10)%10)+'0'); 
            chars[Solution.k++] = (char) ((t%10)+'0');
            // System.out.println("inside if"+ k);
            return 0;
        }
        else{
            calMod(t/10, chars);
            // System.out.println("inside else"+k);
            chars[Solution.k++] = (char) ((t%10)+'0');
        }
        return 0;
    }
}
