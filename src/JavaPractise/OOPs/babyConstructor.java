package JavaPractise.OOPs;

import org.w3c.dom.ls.LSOutput;

public class babyConstructor {
    public static void main(String[] args) {
        System.out.println("------------------------Default Constructor---------------------");
        baby b1 = new baby();
        System.out.println("Name : "+ b1.name);
b1.sleep();

        System.out.println("------------------------Param Constructor---------------------");
        baby  b2 = new baby("Param Constructor");
        System.out.println("Name : " + b2.name);
       String sleep =  b2.sleep();
        System.out.println(sleep);

        System.out.println("------Default----");
        PublicClassProject p1 = new PublicClassProject("Java");
        System.out.println(p1.name);

    }

}

class baby{
    String name;
    baby(){
        name = "Default";
        System.out.println("baby default constructor");
    }
    baby(String pname){
        this.name = pname;
        System.out.println("baby param constructor");
    }

   public String sleep(){
        System.out.println(name + " is sleeping");
        return "three hours";
    }

}