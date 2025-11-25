package JavaPractise;

public class X {
     X() {
         System.out.print("X ");
     }
     X(int a) {
         this();
         System.out.print(a);
     }
     public static void main(String[] args) { new X(5); } }

class Test {
    private Test() {
        System.out.print("Private ");
    }

    public static void main(String[] args) {
        Test t = new Test(); // Uncommenting this line causes error
    }
}
//class Base { void foo() { System.out.print("Base foo "); } } class Derived extends Base { void foo() { System.out.print("Derived foo "); } void bar() { super.foo(); } public static void main(String[] args) { new Derived().bar(); } }

class One {
    void show() {
        System.out.print("One1 ");
    }
}
class Two extends One {
    void show() { System.out.print("Two two ");
    }
}
class Three extends Two { }