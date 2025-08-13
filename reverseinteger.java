class Solution {
    public int reverse(int x) {
    double rev=0;
            while(x>0||x<0){
                int digit = x%10;
                rev=rev*10+digit;
                x/=10;;
            }
            if(rev<Math.pow(-2,31) ){
           return 0;
            }
        else if (rev>(Math.pow(2,31)-1)){
               return 0;
            }
            int num = (int)(rev);
            return num ;
            
}
}

    

