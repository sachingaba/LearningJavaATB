package JavaPractise;

public class For_Loop_inner {
    public static void main(String[] args) {
      outer:      for(int i=1; i<=4;i++) {

            inner: for(int j=1; j<=4;j++) {
            if(j==1) break outer;
        }
        System.out.print("A"); // Will not print
        }
        for(int i=0; i<3; i++) {
            if(i == 1) return;
            System.out.print(i + " "); }
      //  int x = 0; switch(x) { case 0: System.out.print("Zero "); case 1: System.out.print("One "); default: System.out.print("Default "); }
       }
}
