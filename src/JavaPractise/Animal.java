package JavaPractise;

public class Animal {

    void sound(){
        System.out.println("Animal Sounds");
    }
}
class dog extends Animal {

    void sound(){
        System.out.println("Dogs says: Woof! Woof!");
    }
}
class cat extends Animal {

    void sound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}
class Animalhere{

    public static void main(String[] args) {
        Animal dog = new dog();
        dog.sound();

        Animal cat = new cat();
        cat.sound();

        Animal caty = new Animal();
        caty.sound();

     //   cat catto = new dog(); no connection between these two

    }
}
