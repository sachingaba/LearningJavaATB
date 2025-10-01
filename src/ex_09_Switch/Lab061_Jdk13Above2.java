package ex_09_Switch;

public class Lab061_Jdk13Above2 {
    public static void main(String[] args) {
        int itemcode = 007;

        switch (itemcode){
            case 001, 003 , 006 :
                System.out.println("Case 1");
                break;
            case 002, 004 , 005 :
                System.out.println("Case 2");
                break;
            case 007 :
                System.out.println("Case 4");
                break;
          //  case 008 :
          //      System.out.println("Case 5");
          //      break;
            default :
                System.out.println("Case 3");
                break;


        }
    }
}
