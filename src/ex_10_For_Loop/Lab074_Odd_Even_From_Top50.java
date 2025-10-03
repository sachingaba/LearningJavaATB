package ex_10_For_Loop;

public class Lab074_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // to find the EVEN no from 1 to 50
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
            }
        }
        // to find the ODD no from 1 to 50
            for (int i = 1; i < 50; i++) {
                if (i % 2 != 0) {
                    System.out.println("ODD -> " + i);
                }
            }



    }
}
