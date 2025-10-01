package ex_09_Switch;

public class Lab064_Interview5 {
    public static void main(String[] args) {
        char code = 'A'; // to confuse you

        switch (code){
            case 'B' :
                System.out.println("-1 test");
                break;
            case 'C' :
                System.out.println("2 test");
                break;

            default:
                System.out.println("nothing test");
                break;

        }
    }
}
