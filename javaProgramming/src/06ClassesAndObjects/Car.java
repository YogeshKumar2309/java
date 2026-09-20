

public class Car {
    //instance variable (properties)
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;   


    //instance method

    public void drive() {
        if(currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel");
        } else {
        System.out.println("Car is driving");
        currentFuelInLiters--;
        }
    }


   

}