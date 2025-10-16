package ex_18_OOPs_Constructors;

public class car2 {
String name;
    int model;
    int year;
    car2(int model){
        this.model = model;// two parameterized constructor --> constructor Overloading
    }


    // Default Constructor
    car2(String name,int model,int year) {
        this(2000); // constructor chaining
       this.name = name;
        this.model = model;
        this.year = year;
        System.out.println("DC");


    }

}
