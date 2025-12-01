package JavaPractise.Method_Overloading;

public class Return_With_parameters {
    public static void main(String[] args) {
        System.out.println(add(8));
        System.out.println(add(3,4));
        System.out.println(add(55.5,66.6));
        System.out.println(add("sac","-hin"));
    }
    static int add(int x,int y){
        return x+y;
    }
    static double add(double x,double y){
        return x+y;
    }
    static String add(String x,String y){
        return x+y;
    }
    static boolean add(int x){
        return true;
    }
}
