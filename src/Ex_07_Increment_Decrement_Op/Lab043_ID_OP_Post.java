package Ex_07_Increment_Decrement_Op;

public class Lab043_ID_OP_Post {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++); //pre-increment

        //Post Increment == first print and then increase the value.
        int a_post = 10;
        System.out.println("before increment " + a_post); // before increment
        int b = a_post++; // first assign the value to b and then post increment
        System.out.println("originally assigned " + b); // originally assigned
        System.out.println("after increment " + a_post); // after increment





    }
}
