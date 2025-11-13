package ex_10_For_Loop;

public class Lab074_ODD_Even_Together {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {

            if(i%2==0){
                System.out.println("Even -> " + i);
            }else {
                System.out.println("ODD -> "+ i);
            }

        }
    }
}
