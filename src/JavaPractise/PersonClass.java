package JavaPractise;

public class PersonClass {
    String name;
    int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Name:'" + name + '\'' +
                ", Age:" + age + " ";
    }
    public static void main(String[] args) {
PersonClass p1 = new PersonClass("John",25);
        PersonClass p2 = new PersonClass("Alice",30);
        System.out.println(p1.toString() + p2.toString());

    }

}

