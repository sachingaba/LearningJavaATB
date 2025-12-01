package JavaPractise.Method_Overloading;

public class Method_Overloading {
    public static void main(String[] args) {
        //no return no parameters
         main5();

         main5("Sachin");
    }

   static void main5() {
        System.out.println("hello");
    }
   static void main5(String x) {
       System.out.println("hello " + x);
   }
}
