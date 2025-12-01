package JavaPractise.Access_Modifier.Cop;

public class JRcop extends copmain {
    public JRcop(int bullet) {
        super(bullet);
    }
   void fine(){
        System.out.println("no fine for cops");
    }

    public static void main(String[] args) {
        JRcop jr = new JRcop(1000);
        jr.uniform();
        jr.canIShoot();
    }
}
