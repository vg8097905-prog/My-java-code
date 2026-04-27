package OOPs;
class Numberunits{
    void reverse(){
        int n =1234;int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
            }
            System.out.println("reverse no is:"+rev+"\n"+"Original no is:"+n);
    }
    void pallindrome(){
        int n =1234;int rev=0;int temp=n;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
       }
            if (temp==rev){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            
    }
}


public class Q23 {

    public static void main(String[] args) {
        Numberunits n1=new Numberunits();
        n1.reverse();
        n1.pallindrome();
    }
}
