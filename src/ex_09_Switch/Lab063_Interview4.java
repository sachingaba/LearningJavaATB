package ex_09_Switch;

public class Lab063_Interview4 {
    public static void main(String[] args) {
        int a = 11; // to confuse you

        switch (-1){
            case -1 :  // matches
                System.out.println("10");
                break;
            case 2 :
                System.out.println("9");
                break;

            default:
                System.out.println("nothing test");
                break;

        }
    }
}
