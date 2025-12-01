package JavaPractise.Access_Modifier.Criminal;

import JavaPractise.Access_Modifier.Cop.JRcop;

public class Criminal {
    public static void main(String[] args) {
        JRcop thief = new JRcop(10000);
      //  thief.fine();
        thief.canIShoot();


    }
}
