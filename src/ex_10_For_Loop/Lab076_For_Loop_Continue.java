package ex_10_For_Loop;

public class Lab076_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                continue; // it will skip the below code and go back to for loop with no.6
            }
            System.out.println(i);

        }
    }
}
