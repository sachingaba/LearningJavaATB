package JavaPractise.Method_Overloading;

public class Return_With_No_Parameters {
    public static void main(String[] args) {
        System.out.println(names());
        System.out.println(names("yahoo"));
    }
    static String names(){

        return "Intercell";
    }
    static String names(String x){
        return x;
    }
}
