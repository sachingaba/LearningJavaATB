package ex_20_Polymorphism.Method_overloading;

public class Lab133_Poly_Method_overloading {
    public static void main(String[] args) {
mathOperations m1 = new mathOperations();
m1.add(7,9);
m1.add("sachin" , "Gaba");
m1.add(42,7.8);
m1.add(3240552,3055423,6576);
m1.add(8989888252525l,7525252588787l );
    }

    static class mathOperations {
        int add(int a, int b) {
            System.out.println("Int called");
            return a + b;
        }

        int add(int a, int b, int c) {
            System.out.println("Int called");
            return a + b + c;
        }

        double add(double a, double b) {
            System.out.println("double called");
            return a + b;
        }

        long add(long a, long b) {
            System.out.println("Long called");
            return a + b;

        }

        String add(String a, String b) {
            System.out.println("String called");
            return a + b;

        }
    }
}
