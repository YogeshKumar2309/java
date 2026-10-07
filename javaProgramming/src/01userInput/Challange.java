import java.util.Scanner;

/**
 * 
 * Challange
 * 
 * 1.Create a program to input name of the person and respond with "Welcome Name
 * to kg coding"
 * 2. Create a program to add two numbers.
 */
public class Challange {
    // Take a user input in string
    public String userName() {
        System.out.print("Please, Enter your Name : ");
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        return Name;
    }

    // Take a user input integer
    public static  int numInput() {
        System.out.print("Enter a number : ");
        Scanner numInput = new Scanner(System.in);
        return numInput.nextInt();
    }

    //Add 2 numbers
    public int sum(){
        int n1 = numInput();
        int n2 = numInput();
        return n1 + n2;
    }

    // Welcome message
    public String welComeMsg() {
        Challange obj = new Challange();
        String username = obj.userName();
        return "Welcome " + username + " to kg coding";
    }

    public static void main(String[] args) {
        // User input
        Challange obj = new Challange();
        String welcomeMsg = obj.welComeMsg();
        System.out.println(welcomeMsg);


        int sumResult =  obj.sum();
        System.out.println("The sum of Numbers " + sumResult);

        
    }

}

