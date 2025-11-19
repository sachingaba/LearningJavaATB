package JavaPractise;

public class  OverTest {
    void print(Object o) {
        System.out.print("Object ");
    }
    void print(String s) {
        System.out.print("String ");
    }

    public static void main(String[] args) {
        OverTest ot = new OverTest(); ot.print('c');
    }


}

