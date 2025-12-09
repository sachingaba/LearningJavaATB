package ex_26_Wrapper_Class;

public class Lab155_Wrapper_Conversions {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;
long ak = 20L;

        //Convert to Wrapper here

        Integer a1 = Integer.parseInt(num);
        // Double.parseDouble();

        Integer as = aa;


        Long akl = ak;

        //Float.parseFloat();
        Float f1 = Float.parseFloat(num);


        //String to primitive

        int a_p = Integer.parseInt(num);

        //10 value stored in Integer a10
        Integer a10 = Integer.valueOf(10);
        System.out.println(a10);

    }
}
