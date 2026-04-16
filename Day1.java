// public class Day1{
//   public static void main(String[] args) {
//     Integer a = 200;
//     Integer b = 200;
//     System.out.println(a == b); // ?
       
//     Integer x = 100;
//     Integer y = 100;
//     System.out.println(x == y); // ?
//   }
// }
class Day1{
    public static void main(String[] args) {
       for(int i = 0; i < 4; i++){
        for(int space = 0; space < (4-i); space--){
            for(int j = 0; j <= 4; i++){
            System.out.print("* ");
        }
    }
        System.out.println(" ");
       }
    }
}