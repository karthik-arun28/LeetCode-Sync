class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;

        long y = (long) x/2;
        long max = y;
        while(y*y!=x){
            // System.out.println(y+"-"+max);
            // System.out.println(y*y);
            // System.out.println(max);
            // System.out.println(y*y>x);
            if(y*y>x){
                max = y;
                y=y/2;
            }
            else{
                if(y+(y/2)>=max){
                    y=y+((max-y)/2);
                    System.out.println(y);
                }
                else{
                    if(y+(y/2)==y){
                        y++;
                    }
                    else{
                        y=y+(y/2);
                    }
                }
            }
            if(y==max || (y==(max-1) && y*y<=x)){
                    return (int)y;
                }
        }
        return (int)y;
    }
}
