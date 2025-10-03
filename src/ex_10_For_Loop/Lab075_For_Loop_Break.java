package ex_10_For_Loop;

public class Lab075_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.println(i);
            if(i==10){
               System.out.println("this is end on 10");
                break; // exit from the for LOOP
            }
            System.out.println(i); // it  will not run on 10 th time because exit using break above
        }
    }
}
