public class Challenge {

    public static void arithmeticOpr() {
        System.out.print("Enter the first number: ");
        int n1 = Input.sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = Input.sc.nextInt();

        System.out.println("sum : " + (n1 + n2));
        System.out.println("sub : " + (n1 - n2));
        System.out.println("mul : " + (n1 * n2));
        System.out.println("div : " + ((float)n1 / n2));
        System.out.println("mod : " + (n1 % n2));
    }

    public static void productOfFloat() {
        System.out.print("Enter the 1st float number: ");
        float a = Input.sc.nextFloat();
        System.out.print("Enter the 2nd float number: ");
        float b = Input.sc.nextFloat();

        System.out.println("Product of two float. \n" + (a * b));
    }

    public static void Perimeter() {
        System.out.print("Enter the side 'A' of ractenge: ");
        int a = Input.sc.nextInt();

        System.out.print("Enter the side 'B' of ractenge: ");
        int b = Input.sc.nextInt();

        System.out.print("Enter the side 'C' of ractenge: ");
        int c = Input.sc.nextInt();

        System.out.print("Enter the side 'D' of ractenge: ");
        int d = Input.sc.nextInt();

        System.out
                .println("Perimeter of " + a + " + " + b + " + " + c + " + " + d + " + " + " is : " + (a + b + c + d));

    }

    public static void areaOfTriangle() {
        // (Area of triangel = 1/2*B*H)
        System.out.print("Enter the Base of triangle : ");
        float B = Input.sc.nextFloat();

        System.out.print("Enter the Height of triangle : ");
        float H = Input.sc.nextFloat();

        System.out.println("The Area of Triangle is : " + ((1.0 / 2) * B * H));
    }

    public static void simpleIntres() {
        // (Simple Interest = (P*T*R)/100)
        System.out.print("Enter the Principle amount: ");
        float P = Input.sc.nextFloat();
         
        System.out.print("Enter the Time : ");
        float T = Input.sc.nextFloat();
         
        System.out.print("Enter the Rate  : ");
        float R = Input.sc.nextFloat();


        float simpleIntres = (P*R*T)/100;

        System.out.println("Simple intrest = " + simpleIntres);
        
    }


    public  static  void compoundIntrest() {
        // Compund Interest = P(1+R/100)t
       
        System.out.print("Enter the Principle amount: ");
        float P = Input.sc.nextFloat();
         
        System.out.print("Enter the Time : ");
        float T = Input.sc.nextFloat();
         
        System.out.print("Enter the Rate  : ");
        float R = Input.sc.nextFloat();


        float amount = (float) (P* Math.pow((1+R),T));
        float compoundIntrest = amount - P;

        System.out.println("Principle intrest = " + compoundIntrest);
    
    }

    public static void celsiusToFahrenheit(){
        // ( C = (F-32)*5/9)
        System.out.print("Enter the Temprature in celsius : ");
        float celsius = Input.sc.nextFloat();

        float fahrenheit = (celsius * (9.0f/5)) + 32;

        System.out.println("fahrenheit : " + fahrenheit);
    }

    public static void main(String[] args) {
        // 1. Create a program that takes two numbers and shows result of all arithmetic
        // operators(+,-,*,/,%)
        // arithmeticOpr();

        // 2. Create a program to calculate product of two floating points numbers.
        // productOfFloat();

        // 3. Create a program to calculate Perimeter of a rectangle. (Perimeter of
        // rectangel ABCD = A + B + C + D
        // Perimeter();

        // 4. Create a program to calculate Area of Triangle.(Area of triangle =
        // 1/2*B*H)
        // areaOfTriangle();

        // 5. Create a program to calculate simple interest. (Simple Interest =
        // (P*T*R)/100)
        // simpleIntres();

        // 6. Create a program to calculate Compound interest. (Compund Interest =
        // P(1+R/100)t)
        // compoundIntrest();

        // 7. Create a program to convet Fahrenheit to Celsius. ( C = (F-32)*5/9)
        celsiusToFahrenheit();

    }
}
