package ex_13_Functions;

import java.util.Scanner;

public class Lab089_User_defined_One {
    public static void main(String[] args) {
        int result = sumof2_without_Parameter();
        System.out.println(result);
        int age = sumof2_with_Parameter(5,9);
        System.out.println("age is " + age);

        int age2 = sumof2_with_Parameter(11,14);
        System.out.println("age2 is " + age2);

        int add = sumof_userinput();
        System.out.println("Sum-- " + add);

        //scanner code here and calling parameter function
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int a = scanner.nextInt();
        System.out.println("Enter no. 2");
        int b = scanner.nextInt();
        int result_withParamter = sumof2_with_Parameter(a,b);
        System.out.println("result_withParameter = " + result_withParamter);
    }
    //Without Parameter
    static int sumof2_without_Parameter(){
        return 3+4;
    }
    //With parameter
    static int sumof2_with_Parameter(int a, int b) {
        return a + b;
    }
    //scanner code in function
    static int sumof_userinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int a = scanner.nextInt();
        System.out.println("Enter no. 2");
        int b = scanner.nextInt();
        return a+b;
    }
}
