import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sum of two number program. \nPlease Enter the first Number: ");
        int n1 = input.nextInt();
        
        System.out.print("Please Enter the Second Number: ");
        int n2 = input.nextInt();

        System.out.println("The Sum of " + n1 + " + " + n2 + " = " + (n1+n2));
    }
}
