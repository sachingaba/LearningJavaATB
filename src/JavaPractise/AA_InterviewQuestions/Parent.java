package JavaPractise.AA_InterviewQuestions;

public class Parent {

    static void display() {
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        Parent child = new Child();
        child.display();
    }

    static class Child extends Parent {

        static void display() {
            System.out.println("CHild");
        }
    }
}

