package JavaPractise.Inheritance;

public class Heirarichical {
    public static void main(String[] args) {
// father's inheritance
        System.out.println("// Father's objects------------->");
        father s1 = new sachin();
        System.out.println(s1.bhk);

        father s2 = new sagar();
        System.out.println(s2.bhk);
// Self objects
        System.out.println("// Self objects------------->");
        sachin s3 = new sachin();
        System.out.println(s3.bhk);

        sagar s4 = new sagar();
        System.out.println(s4.bhk);

    }
}
class father{
    int bhk = 3;
    father(){
        System.out.println("Father's Home");
    }
}
class sachin extends father{
    int bhk =2;
    sachin(){
        System.out.println("Sachin's Home");
    }

}
class sagar extends father{
    int bhk = 4;
    sagar(){
        System.out.println("Sagar's Home");
    }

}
