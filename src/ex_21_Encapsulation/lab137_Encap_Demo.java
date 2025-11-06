package ex_21_Encapsulation;

public class lab137_Encap_Demo {
    public static void main(String[] args) {

// Public constructor
        vwoLogin l1 = new vwoLogin("Sachin", "xyz@123");
        System.out.println(l1.password);
        l1.password = "xtx@123";
        System.out.println(l1.password); // can be changed as well

// Private Constructor

        goodvwoLogin gl1 = new goodvwoLogin("sachin","gaba@123");
        //password will not show as it is hidden and private

        //System.out.println(gl1.password);

        // After getter setter introduced in constructor

        String pass = gl1.getPassword();
        System.out.println(pass);
        String username = gl1.setUsername("Rahul");
        System.out.println(username);
        System.out.println( "check" + gl1.getUsername());
     //   gl1.setPassword(); // As I commented in setter

        // adding condition to set password -- permission

        gl1.setPassword("Sachin@123",true);
        System.out.println(gl1.getPassword());




    }

}


class vwoLogin{

    public String username;
    public String password;

        public vwoLogin(String username,String password){
    this.username = username;
    this.password = password;

        }
}
class goodvwoLogin {

    private String username;
    private String password;
// introduced getter setter to access private variables

    public String getUsername() {
        return username;

    }

    public String setUsername(String username) {
        this.username = username;


        return username;
    }

    public String getPassword() {
        return password;
    }
// Adding Condition to set the password
    public void setPassword(String password,boolean isAllowed) {
        if(isAllowed)
        {
            this.password = password;
        }else{
            System.out.println("not allowed");
        }
    }



     goodvwoLogin(String username, String password) {
        this.username = username;
        this.password = password;

    }

}
