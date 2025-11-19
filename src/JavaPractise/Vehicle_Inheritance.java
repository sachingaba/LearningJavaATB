package JavaPractise;

public class Vehicle_Inheritance {
    public void starts(){
        System.out.println("Engine starting");
    }
}
class car extends Vehicle_Inheritance{

    public void starts(){
        System.out.println("Car engine starts with a roar!");
    }
}
class bike extends Vehicle_Inheritance{

    public void starts(){
        System.out.println("Bike engine starts with a purr!");
    }
}
class vehicleRun{
    public static void main(String[] args) {
        Vehicle_Inheritance[] vehicles = {new car(), new bike()};

        System.out.println("Calling start() method on each vehicle in the array:");
        System.out.println("-------------------------------------------------");

        // Iterate through the array using a for-each loop
        // The start() method called here is dynamically bound at runtime
        for (Vehicle_Inheritance vehicle : vehicles)
            vehicle.starts();

        Vehicle_Inheritance v1 = new bike();
        Vehicle_Inheritance v2 = new car();

        Vehicle_Inheritance[] v3 = {v1,v2};
        for (int i = 0; i < v3.length; i++) {
            v3[i].starts();

        }
        }

    }
