package ex_14_Strings;

public class Lab095_String_Immutable {
    public static void main(String[] args) {
        String name = "Sachin";
        name.toUpperCase();
        //here output will be Sachin and not uper case SACHIN .
        System.out.println(name);
        //For Upper case SACHIN  , We need to assign that to the string
         name = name.toUpperCase();
        System.out.println(name);

    }
}
