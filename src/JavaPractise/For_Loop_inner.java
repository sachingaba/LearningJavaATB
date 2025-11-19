package JavaPractise;

public class For_Loop_inner {
    public static void main(String[] args) {
      outer:      for(int i=1; i<=4;i++) {

            inner: for(int j=1; j<=4;j++) {
            if(j==1) break outer;
        }
        System.out.print("A"); // Will not print
        }


        outer: for(int i = 0; i < 2; i++) {
            inner: for(int j = 0; j < 2; j++) {
            if(j == 1) continue outer;
            System.out.print(i + "-" + j + " ");
        }
        }
        int x = 3; switch(x) { case 1: System.out.print("One "); break; case 2: System.out.print("Two "); break; } System.out.print("Done");
         }
}
