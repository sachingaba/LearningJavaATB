package ex_22_Accessmodifier.Criminal;

import ex_22_Accessmodifier.Police.cop;

public class Thief {
    public static void main(String[] args) {
        cop thief = new cop(100);
     //   thief.canIShoot(); // if public then yes , if private then, No .. canishoot -- public or private
      //  thief.thisdefaultF1(); will not work from cop class
    }
}
