
public  class Swap {

     public static void main(String[] args) {
        //create a program to swap two numbers
        int a = 10;
        int b = 20;
        System.out.println("before swap\n" + "a : " + a + "\nb : " + b);
        int c = a;
         a = b;
         b = c;
         System.out.println("after swap\n" + "a : " + a + "\nb : " + b);
     }
}