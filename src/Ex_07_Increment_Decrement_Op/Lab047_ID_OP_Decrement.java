package Ex_07_Increment_Decrement_Op;

public class Lab047_ID_OP_Decrement {

    public static void main(String[] args) {
        int a = 10;
        //int result = a--;
        //System.out.println(result); //10

        System.out.println("Post decrement " + a--); //10
        System.out.println("Post decrement assigned " + a);  //9

        System.out.println("Pre decrement " + --a); //8
        System.out.println("Pre decrement assigned "+ a);  //8

    }
}
