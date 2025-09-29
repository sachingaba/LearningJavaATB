package ex_08_If_Condition;

public class lab048_If {

    public static void main(String[] args) {

        String Input = args[0];
        System.out.println(Input);

        int ageI = Integer.parseInt(Input);
        System.out.println(ageI);

        if (ageI>18) {
            System.out.println("You can vote");
        }
    }




}
