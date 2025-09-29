package ex_08_If_Condition;

public class Lab050_If_P1 {
    public static void main(String[] args) {

    String ageInput = args[0];
    int age = Integer.parseInt(ageInput);
    //int age = Integer.parseInt(args[0]);

        if (age > 18) {

            System.out.println("Yes you can vote");
        } else {

            System.out.println("can't");
    }
}

}
