package JavaPractise.OOPs;

public class OOpsConcept {
    public static void main(String[] args) {
        bhk2 h1 = new bhk2();
        System.out.println(h1.rooms);
        System.out.println(h1.wash);

        bhk2 h3 = new bhk2("Sachin");
        h3.hall();
        System.out.println("Rooms : " + h3.rooms);
        System.out.println("Washroom : " + h3.wash);


        bhk3 h2 = new bhk3();

        System.out.println(h2.rooms);
        System.out.println(h2.wash);
        System.out.println(h2.name);
        h2.hall();

    }
}
class bhk2{
    int rooms = 2;
    int wash = 2;
    String name;
    bhk2(){
        System.out.println("2bhk");
    }
    bhk2(String name){
        this.name = name;
        System.out.println("House of "+ name);
    }
    void hall(){
        System.out.println("Hall of " + this.name);
    }

}
class bhk3 extends bhk2{
    int rooms = 3;
    int wash = 3;
    String name ;
     bhk3(){
name = "sam";
         System.out.println("3bhk");


    }

    @Override
    void hall() {
        System.out.println("Hall of " + this.name);
    }
}

