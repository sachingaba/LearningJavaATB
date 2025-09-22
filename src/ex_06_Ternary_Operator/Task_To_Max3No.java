package ex_06_Ternary_Operator;

public class Task_To_Max3No {

    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 90;
        int n3 = -110;

        String Max = n1>=n2 ? (n1>=n3? "N1 is Highest ":"N3 is highest"):(n2>=n3 ? "N2 is highest": "N3 is highestsss");
        System.out.println(Max);
    }
}
