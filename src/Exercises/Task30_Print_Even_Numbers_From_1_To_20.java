package Exercises;

public class Task30_Print_Even_Numbers_From_1_To_20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                System.out.print(i + ",");
            }

        }
    }
}
