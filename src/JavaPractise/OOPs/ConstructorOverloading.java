package JavaPractise.OOPs;

public class ConstructorOverloading {
    public static void main(String[] args) {
        A1 s1 = new A1(36);
        System.out.println(s1.age);

        A1 s2 = new A1(34,"Sachin");
        System.out.println(s2.age);
        System.out.println(s2);
gaba g1 = new gaba();
        gaba.home();
        g1.test();
    }
    static class gaba{
        static{
            System.out.println("hello static");
        }
        gaba(){
            System.out.println("Static");
        }
        static void home(){
            System.out.println("Static Home");
        }
        void test(){
            System.out.println("test");
            home();
        }
    }
}
class A1 {
    int age;
    String name;

    A1(int age) {
        this.age = age;
    }

    A1(int age, String name) {
        this(25);  //Constructor Chaining
        // this.age = age;
        this.name = name;
        System.out.println("Overloading done");

    }

    @Override
    public String toString() {
        return "A1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
