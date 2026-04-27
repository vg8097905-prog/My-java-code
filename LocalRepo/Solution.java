class Solution {
    public static void main(String[] args) {
         // code here
         int n;
        int x=1;
        int temp=n;
        int sum=0;
        where(n!=0){
            int d = n%10;
            sum=x*d*d*d;
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
            else {
            return false;
        }
    }
       
    }
