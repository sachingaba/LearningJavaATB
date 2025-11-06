package ex_20_Polymorphism.Method_Overridding;

public class Lab135_MOveridding {
    public static void main(String[] args) {
       //Run-time Polymorphism

        Son s1 = new Son();
        Son.home();

        Father f1 = new Father();
        f1.home();

        //Dynamic Dispatch

        Father f2 = new Son();
        f2.home();

        // cant be done
       /* Son s2 = new Father();
        s2.home();
        */

    }
}

    class Father {
        static void home() {
            System.out.println("Father's House");
        }
    }

        class Son extends Father {
            static void home() {
                System.out.println("son's House");
            }
        }


